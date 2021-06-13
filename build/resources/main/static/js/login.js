$(document).ready(function() {  
$("#formLogin").submit(function(e) {
       e.preventDefault();
    }).validate({
		
      	rules: {
                   correo: {
                           required: true,
                   },
                password: {
                           required: true
                   }
           },
           messages: {
                   correo: {
						
                           required: "Introduzca correo"
                   },
                   password: {
                   			required: "Introduzca contraseña"
                   }
           },

        //errorPlacement: function(error, element) {
         //     error.appendTo(element.parent());
         //},
         submitHandler: function(form) {
            $.post("/login/acceder", $("#formLogin").serialize(), function(fragment) {
			console.log(fragment);
			$("#resul").replaceWith(fragment);
			$('#correo').val('');
			 $('#password').val('')
            });
            return false;
         }
	
    });
    
});