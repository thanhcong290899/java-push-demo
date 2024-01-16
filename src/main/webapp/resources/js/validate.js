/**
 * 
 */
$(document).ready(function() {
	$.validator.addMethod(
		"validatemamay", function(value, elenment) {
			return this.optional(elenment) || /^M+[0-9]{3}$/.test(value);
		},
		"Vui long nhap ma may hop le"
	)
	$("#vitriform").validate({
		rules: {
			viTri: {
				required: true
			},
			maMay: {
				required: true,
				validatemamay: true
			}
		},
		messages: {
			viTri: {
				required: "vui long nhap vi tri"
			},
			maMay: {
				required: "Vui long nhap ma may"
			}
		},
		submitHandler: function(form) {
			form.submit();
		},
	}
	)
})