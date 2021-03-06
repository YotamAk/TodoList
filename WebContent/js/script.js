$("#sortable").sortable();
$("#sortable").disableSelection();

countTodos();

// all done btn
$("#checkAll").click(function(){
    AllDone();
});

//create todo
$('.add-todo').on('keypress',function (e) {
      e.preventDefault
      if (e.which == 13) {
           if($(this).val() != ''){
           var todo = $(this).val();
            createTodo(todo); 
            countTodos();
           }else{
               // some validatio
           }
      }
});
$('.todolist').on('click','.additem', function() {
	if($('.add-todo').val() != ''){
      var todo = $('.add-todo').val();
       createTodo(todo); 
       countTodos();
      }else{
          // some validatio
      }
});
//both functions

// mark task as done
$('.todolist').on('change','#sortable li input[type="checkbox"]',function(){
    if($(this).prop('checked')){
        var doneItem = $(this).parent().parent().find('label').text();
        $(this).parent().parent().parent().addClass('remove');
        done(doneItem);
        countTodos();
    }
});

//delete done task from "already done"
$('.todolist').on('click','.remove-item',function(){
    removeItem(this);
});

// count tasks
function countTodos(){
    var count = $("#sortable li").length;
    $('.count-todos').html(count);
}

//create task
function createTodo(text){
    var markup = '<li class="ui-state-default"><div class="checkbox"><label><input type="checkbox" name=' + text + ' value="" />'+ text +'</label></div></li>';
    $('#sortable').append(markup);
    insertItemServletCall(text);
    $('.add-todo').val('');
}

//mark task as done
function done(doneItem){
    var done = doneItem;
    var markup = '<li>'+ done +'<button class="btn btn-default btn-xs pull-right  remove-item"><span class="glyphicon glyphicon-remove"></span></button></li>';
    $('#done-items').append(markup);
    $('.remove').remove();
    removeItemServletCall(doneItem);
}

//mark all tasks as done
function AllDone(){
    var myArray = [];

    $('#sortable li').each( function() {
         myArray.push($(this).text());   
    });
    
    // add to done
    for (i = 0; i < myArray.length; i++) {
        $('#done-items').append('<li>' + myArray[i] + '<button class="btn btn-default btn-xs pull-right  remove-item"><span class="glyphicon glyphicon-remove"></span></button></li>');
    }
    
    // myArray
    $('#sortable li').remove();
    countTodos();
    markAllItemsDoneServlet();
}

//remove done task from list
function removeItem(element){
    $(element).parent().remove();
}

//Servlets calls

function insertItemServletCall(text) {
	$.ajax({
		url: "InsertItemServlet",
		type: "post",
		data: {'newItem': text,
				'userid': $('.user-id').val()},
		success:function() {}
	});
}

function removeItemServletCall(doneItem) {
	$.ajax({
		url: "RemoveItemServlet",
		type: "post",
		data: {'removeItem': doneItem,
				'userid': $('.user-id').val()},
		success:function() {}
	});
}

function markAllItemsDoneServlet() {
	$.ajax({
		url: "MarkAllItemsDoneServlet",
		type: "post",
		data: {'userid': $('.user-id').val()},
		success:function() {}
	});
}