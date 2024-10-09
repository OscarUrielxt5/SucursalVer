package com.sucursal.ordenes.request;

import java.math.BigDecimal;

public class OrdenRequest {

    private int sucursalId;

    private BigDecimal total;

    public int getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(int sucursalId) {
        this.sucursalId = sucursalId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
