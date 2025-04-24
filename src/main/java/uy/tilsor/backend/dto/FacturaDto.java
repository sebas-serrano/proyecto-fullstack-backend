package uy.tilsor.backend.dto;

import java.time.LocalDate;

public class FacturaDto {
	
    private Long id;
    
    private LocalDate fecha;
    
    private Double total;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
    
}