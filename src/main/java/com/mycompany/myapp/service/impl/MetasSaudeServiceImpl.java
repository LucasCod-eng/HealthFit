package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.MetasSaude;
import com.mycompany.myapp.repository.MetasSaudeRepository;
import com.mycompany.myapp.service.MetasSaudeService;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link com.mycompany.myapp.domain.MetasSaude}.
 */
@Service
@Transactional
public class MetasSaudeServiceImpl implements MetasSaudeService {

    private final Logger log = LoggerFactory.getLogger(MetasSaudeServiceImpl.class);

    private final MetasSaudeRepository metasSaudeRepository;

    public MetasSaudeServiceImpl(MetasSaudeRepository metasSaudeRepository) {
        this.metasSaudeRepository = metasSaudeRepository;
    }

    @Override
    public MetasSaude save(MetasSaude metasSaude) {
        log.debug("Request to save MetasSaude : {}", metasSaude);
        return metasSaudeRepository.save(metasSaude);
    }

    @Override
    public MetasSaude update(MetasSaude metasSaude) {
        log.debug("Request to update MetasSaude : {}", metasSaude);
        return metasSaudeRepository.save(metasSaude);
    }

    @Override
    public Optional<MetasSaude> partialUpdate(MetasSaude metasSaude) {
        log.debug("Request to partially update MetasSaude : {}", metasSaude);

        return metasSaudeRepository
            .findById(metasSaude.getId())
            .map(existingMetasSaude -> {
                if (metasSaude.getTipoMeta() != null) {
                    existingMetasSaude.setTipoMeta(metasSaude.getTipoMeta());
                }
                if (metasSaude.getValorMeta() != null) {
                    existingMetasSaude.setValorMeta(metasSaude.getValorMeta());
                }
                if (metasSaude.getDataLimite() != null) {
                    existingMetasSaude.setDataLimite(metasSaude.getDataLimite());
                }

                return existingMetasSaude;
            })
            .map(metasSaudeRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<MetasSaude> findOne(Long id) {
        log.debug("Request to get MetasSaude : {}", id);
        return metasSaudeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete MetasSaude : {}", id);
        metasSaudeRepository.deleteById(id);
    }
}
