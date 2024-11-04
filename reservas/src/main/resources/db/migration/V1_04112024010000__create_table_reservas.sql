CREATE TABLE IF NOT EXISTS reserva_schema."reservas" (
    reservas_id UUID NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    capacidad INTEGER NOT NULL,
    tipo_comida VARCHAR(50) NOT NULL,
    PRIMARY KEY (reservas_id)
);
