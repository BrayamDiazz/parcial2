<%-- 
    Document   : index
    Created on : 11/10/2013, 08:28:21 AM
    Author     : 202
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERCCION DE UN NUEVO LIBRO</title>
    </head>
    <body>
        <h1>INSERTAR LIBRO</h1>
        <form action="Servlet" method="post">
             <style>
            body
            {
             background-color: cadetblue;
             text-align: center;
             
            }
            .error
            {
                color:  cyan
            }
            input.error
            {
                background-color: darkviolet
            }
            div
            {
                color: chartreuse;
            }
            form
            {
                color: cyan;
                border-bottom-style: solid;
                border-radius: 20px;
            }
        </style>
    </head> 
    <body>
        <div>INSERCCIÓN DE UN NUEVO LIBRO</div>
        <form id="form1" action ="ruta/">
            
            
             Titulo del Libro:<input type="text" name="nombre" />
             <label for="nombre"><br>
             Autor:<input type="text" name="Autor" value="" />
             <br> 
             Numero de Referencia:
             <input type="text" name="edad" />
             <br>
             Fecha de Publicación:<input type="date" name="bday"><br>
             Tipo de libro:<select name="Tipo de Libro">
                 <option>Reserva</option>
                 <option>Prestamo</option>
             </select><br>
             Descripción:<input type="text" name="Descripcion" value="" /><br>
             Numero de Paginas:<input type="text" name="Numero de paginas " value="" />     
             <br> 
             <input type="submit" value="aceptar" />
             <form class="mensaje error">
  <p><big><span>*** !ATENCIÓN!</span> Encabezado error</big></p>
  <p></p>
  <ul title="Lista de puntos a verificar">
    <li>Debes rellenar el campo obligatorio "Titulo del libro"</li>
    <li>El campo "Numero de Referencia " no tiene un formato correcto. Sólo se aceptan caracteres alfanuméricos</li>
  </ul>
  <hr />
</form>
        </form>
        <script>
            $("#form1").validate(
                     
               {
                   rules:
                           {
                       nombre:
                               {
                           
                             required: true
                             
                               },
                               edad:
                               {
                                    required: true,
                                    digits:true
                               }
                            },
                            messages:
                                   {
                                nombre:
                                        {
                                    required: "porfavor digite solo su nombre"
                                        },
                                        edad:
                                                {
                                              required: "por favor digite su edad",
                                             digits:"por favor digite solo numeros"
                                                
                                                 }
                                   }
              }
              
               
              );
            
        
             
        </script> 
              
    </body>
</html>
