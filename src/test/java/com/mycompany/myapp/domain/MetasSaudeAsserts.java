package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class MetasSaudeAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMetasSaudeAllPropertiesEquals(MetasSaude expected, MetasSaude actual) {
        assertMetasSaudeAutoGeneratedPropertiesEquals(expected, actual);
        assertMetasSaudeAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMetasSaudeAllUpdatablePropertiesEquals(MetasSaude expected, MetasSaude actual) {
        assertMetasSaudeUpdatableFieldsEquals(expected, actual);
        assertMetasSaudeUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMetasSaudeAutoGeneratedPropertiesEquals(MetasSaude expected, MetasSaude actual) {
        assertThat(expected)
            .as("Verify MetasSaude auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMetasSaudeUpdatableFieldsEquals(MetasSaude expected, MetasSaude actual) {
        assertThat(expected)
            .as("Verify MetasSaude relevant properties")
            .satisfies(e -> assertThat(e.getTipoMeta()).as("check tipoMeta").isEqualTo(actual.getTipoMeta()))
            .satisfies(e -> assertThat(e.getValorMeta()).as("check valorMeta").isEqualTo(actual.getValorMeta()))
            .satisfies(e -> assertThat(e.getDataLimite()).as("check dataLimite").isEqualTo(actual.getDataLimite()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertMetasSaudeUpdatableRelationshipsEquals(MetasSaude expected, MetasSaude actual) {}
}
