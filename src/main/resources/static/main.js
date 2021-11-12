nes (23 sloc) 692 Bytes
/**
 * 
 */

$('document').ready(function() {
	
	$('.table .btn-warning').on('click',function(event){
		
		event.preventDefault();
		
		var href= $(this).attr('href');
		
		$.get(href, function(pair, status){
			$('#IdEdit').val(pair.task_id);
			$('#nameEdit').val(student.name);
			$('#departmentEdit').val(student.department);
			$('#updatedByEdit').val(student.updatedBy);
			$('#updatedOnEdit').val(student.updatedOn.substr(0,10));
		});	
		
		$('#editModal').modal();
		
	});
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();
		
	});
	
});