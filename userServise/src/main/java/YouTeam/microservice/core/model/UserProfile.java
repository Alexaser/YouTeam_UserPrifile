package YouTeam.microservice.core.model;


import YouTeam.microservice.core.model.entityUserProfile.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import java.util.List;

@Entity
@Table(name = "userProfile")
public class UserProfile {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private List<String> profileUrl;

    private String bio;

    private String location;

    private List<Skill> skills;

    private List<Experience> experiences;

    private List<Education> educations;

    private List<PortfolioProject> portfolioProjects;

    private List<ExternalLink> externalLinks;

    private PrivacySettings privacySettings;


}
