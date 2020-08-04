$(document).ready(function() {
	$('#case').click(function() {
		if ($(this).is(":checked")) {
			$(".product").removeAttr("disabled");
		} else if ($(this).is(":not(:checked)")) {
			$(".product").attr("disabled", true);
		}
	});
});