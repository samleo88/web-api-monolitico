package com.sistema.blog.servicio;


import com.sistema.blog.dto.PublicacionDTO;

//import java.util.List;
import com.sistema.blog.dto.PublicacionRespuesta;

public interface PublicacionServicio {
    public PublicacionDTO crearPublicacion(PublicacionDTO publicacionDTO);
   //public List<PublicacionDTO> obtenerTodasLasPublicaciones();

   public PublicacionRespuesta obtenerTodasLasPublicaciones(int numeroDePagina,int medidaDePagina,String ordenarPor,String sortDir);

    public PublicacionDTO obtenerPublicacionPorId(long id);

    public PublicacionDTO actualizarPublicacion(PublicacionDTO publicacionDTO,long id);

    public void eliminarPublicacion(long id);
}
