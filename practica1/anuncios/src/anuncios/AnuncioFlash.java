package anuncios;
import java.util.Date;

public class AnuncioFlash extends Anuncio {
	private Date fecha_inicio_;
	private Date fecha_fin_;

	// constructores
	public AnuncioFlash() {
		super();
	}

	// Ovservadores
	public Date getFechaInicio() { return this.fecha_inicio_; }
	public Date getFechaFin() { return this.fecha_fin_; }

	// Modificadores
	public void setFechaInicio(Date fecha_inicio) { this.fecha_inicio_ = fecha_inicio; }
	public void setFechaFin(Date fecha_fin) { this.fecha_fin_ = fecha_fin; }
}