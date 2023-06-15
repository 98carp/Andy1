package ec.edu.espe.examenandresrodriguez.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class UsuarioPerfilService {

    private final ProductoRepository productoRepository;

    public UsuarioPerfilService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public Optional<Producto> obtainByCode(String code) {
        return this.productoRepository.findById(code);
    }

   

    @Transactional
    public Producto update(Producto producto) {
        Optional<Producto> productoOpt = this.productoRepository.findById(producto.getCodigo());
        if (productoOpt.isPresent()) {
            Producto productoTmp = productoOpt.get();
            productoTmp.setNombre(producto.getNombre());
            productoTmp.setDescripcion(producto.getDescripcion());
            productoTmp.setPrecio(producto.getPrecio());
            productoTmp.setEstado(producto.getEstado());
            productoTmp.setIva(producto.getIva());
            productoTmp.setIce(producto.getIce());
            this.productoRepository.save(productoTmp); // update
            return productoTmp;
        } else {
            throw new RuntimeException("Producto que desea modificar no esta registrado");
        }
    }

    @Transactional
    public void delete(String productoCode) {
        try {
            Optional<Producto> productoOpt = this.productoRepository.findById(productoCode);
            if (productoOpt.isPresent()) {
                this.productoRepository.delete(productoOpt.get());
            } else {
                throw new RuntimeException("El prodcuto no esta registrado: " + productoCode);
            }
        } catch (RuntimeException rte) {
            throw new RuntimeException("No se puede eliminar el producto con Codigo: " + productoCode, rte);
        }
    }

}
