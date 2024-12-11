package common;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;


@Getter
@Setter

    public class Configurations {

        private Configurations() {

            System.out.println("Social Network:: Configuration Object Initialised");

        }

        private static Configurations instance = null;

        public static Configurations getInstance() {
            synchronized (Configurations.class) {
                if (instance == null) {
                    instance = new Configurations();
                }
            }
            return instance;
        }


        private Properties configProperties;
        private static Logger logger = LoggerFactory.getLogger(Configurations.class);
        private String urlBasePath;
        private String contentType;
        private String usersCount;
        private String postsCount;
        private String commentsCount;
    }


