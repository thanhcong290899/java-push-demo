/**
 * 
 */
$(document).ready(function() {
	var checkdleted = false;
	$("body").on("click", ".deletemay", function() {
		var target = $(event.target);
		$(".modal").show();
		$(".delete").click(function() {
			checkdleted = true;
			if (checkdleted) {
				var id = $("#idmay").val();
				console.log(id)
				var path = $('#contextPathHolder').attr('data-contextPath');
				window.location.href = path + "/delete?id=" + id;
				checkdleted = false;
				$(".modal").hide();
			}
		})
		$(".nodelete").click(function() {
			$(".modal").hide();

		})

	})
	$("body").on("click", ".deletecustomer", function() {
		var target = $(event.target);
		$(".modal").show();
		$(".delete").click(function() {
			checkdleted = true;
			if (checkdleted) {
				var id = $("#idcustomer").val();
				console.log(id)
				var path = $('#contextPathHolder').attr('data-contextPath');
				window.location.href = path + "/delete1?id=" + id;
				checkdleted = false;
				$(".modal").hide();
			}
		})
		$(".nodelete").click(function() {
			$(".modal").hide();

		})

	})
		$("body").on("click", ".deleteservice", function() {
		var target = $(event.target);
		$(".modal").show();
		$(".delete").click(function() {
			checkdleted = true;
			if (checkdleted) {
				var id = $("#idservice").val();
				console.log(id)
				var path = $('#contextPathHolder').attr('data-contextPath');
				window.location.href = path + "/delete2?id=" + id;
				checkdleted = false;
				$(".modal").hide();
			}
		})
		$(".nodelete").click(function() {
			$(".modal").hide();

		})

	})
	

})