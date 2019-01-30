package sabillon.pum.data.bootstrap;

import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import sabillon.pum.data.models.PhotoFilter;
import sabillon.pum.data.repositories.PhotoFilterRepository;

/*
*@author Miguel Sabillon
*/
@Component
public class PhotoFilterDataInitializer implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(PhotoFilterDataInitializer.class);

    private final PhotoFilterRepository photoFilterRepository;

    public PhotoFilterDataInitializer(PhotoFilterRepository photoFilterRepository) {
        this.photoFilterRepository = photoFilterRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Initializing Photo Filters");

        this.photoFilterRepository.save(new PhotoFilter("\\\\b-1\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b-2\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b-3\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b-4\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b-5\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b-6\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b.jpg\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b.png\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b.gif\\\\b", new Timestamp(new Date().getTime())));
        this.photoFilterRepository.save(new PhotoFilter("\\\\b.jpeg\\\\b", new Timestamp(new Date().getTime())));
    }

}
