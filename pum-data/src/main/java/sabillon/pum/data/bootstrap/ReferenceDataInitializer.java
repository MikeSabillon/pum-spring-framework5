package sabillon.pum.data.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sabillon.pum.data.models.Reference;
import sabillon.pum.data.repositories.ReferenceRepository;

/*
*@author Miguel Sabillon
*/
@Component
public class ReferenceDataInitializer implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(ReferenceDataInitializer.class);

    private final ReferenceRepository referenceRepository;

    public ReferenceDataInitializer(ReferenceRepository referenceRepository) {
        this.referenceRepository = referenceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Initializing References");
        this.referenceRepository.save(new Reference("100_TPU", null));
        this.referenceRepository.save(new Reference("101_TPU", null));
        this.referenceRepository.save(new Reference("103_TPU", null));
        this.referenceRepository.save(new Reference("101_TPP", null));
        this.referenceRepository.save(new Reference("102_TPP", null));
        this.referenceRepository.save(new Reference("103_TPP", null));
        this.referenceRepository.save(new Reference("101_TPF", null));
    }

}
