package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsultaEspecialistaAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertConsultaEspecialistaAllPropertiesEquals(ConsultaEspecialista expected, ConsultaEspecialista actual) {
        assertConsultaEspecialistaAutoGeneratedPropertiesEquals(expected, actual);
        assertConsultaEspecialistaAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertConsultaEspecialistaAllUpdatablePropertiesEquals(ConsultaEspecialista expected, ConsultaEspecialista actual) {
        assertConsultaEspecialistaUpdatableFieldsEquals(expected, actual);
        assertConsultaEspecialistaUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertConsultaEspecialistaAutoGeneratedPropertiesEquals(ConsultaEspecialista expected, ConsultaEspecialista actual) {
        assertThat(expected)
            .as("Verify ConsultaEspecialista auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertConsultaEspecialistaUpdatableFieldsEquals(ConsultaEspecialista expected, ConsultaEspecialista actual) {
        assertThat(expected)
            .as("Verify ConsultaEspecialista relevant properties")
            .satisfies(e -> assertThat(e.getTipoEspecialista()).as("check tipoEspecialista").isEqualTo(actual.getTipoEspecialista()))
            .satisfies(
                e -> assertThat(e.getDataHorarioConsulta()).as("check dataHorarioConsulta").isEqualTo(actual.getDataHorarioConsulta())
            )
            .satisfies(e -> assertThat(e.getStatusConsulta()).as("check statusConsulta").isEqualTo(actual.getStatusConsulta()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertConsultaEspecialistaUpdatableRelationshipsEquals(ConsultaEspecialista expected, ConsultaEspecialista actual) {}
}