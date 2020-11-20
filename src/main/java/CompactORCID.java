import org.orcid.jaxb.model.message.CreationMethod;
import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;
import org.orcid.jaxb.model.v3.release.common.Source;
import org.orcid.jaxb.model.v3.release.record.*;
import org.orcid.jaxb.model.v3.release.record.summary.Educations;
import org.orcid.jaxb.model.v3.release.record.summary.Employments;
import org.orcid.jaxb.model.v3.release.record.summary.Works;
import org.orcid.jaxb.model.v3.release.record.summary.*;

import java.util.Map;

public class CompactORCID {
    Addresses addresses;
    Biography biography;
    Emails emails;
    PersonExternalIdentifiers external_ids;
    Keywords keywords;
    LastModifiedDate orcid_last_modified_date;
    Name name;
    OtherNames other_names;
    String person_path;
    ResearcherUrls researcher_urls;

    String orcid_id_host;
    String orcid_id_uri;


    boolean claimed;
    CompletionDate completion_date;
    CreationMethod creation_method;
    DeactivationDate deactivation_date;
    LastModifiedDate history_last_modified_date;
    Source source;
    SubmissionDate submission_date;
    boolean verified_email;
    boolean verified_primary_email;

    Distinctions distinctions;
    Educations educations;
    Employments employments;
    Fundings fundings;
    InvitedPositions invited_positions;
    LastModifiedDate activity_last_modified_date;
    Memberships memberships;
    PeerReviews peer_reviews;
    Qualifications qualifications;
    ResearchResources research_resources;
    Services services;
    Works works;
    Map<Long, ? extends Activity> activity_map;
    // other
    String path;
    String locale;
    String orcid_type;

    public CompactORCID(Addresses addresses, Biography biography, Emails emails, PersonExternalIdentifiers externalIdentifiers, Keywords keywords, LastModifiedDate lastModifiedDate, Name name, OtherNames otherNames, String person_path, ResearcherUrls researcherUrls) {
        this.addresses = addresses;
        this.biography = biography;
        this.emails = emails;
        this.external_ids = externalIdentifiers;
        this.keywords = keywords;
        this.orcid_last_modified_date = lastModifiedDate;
        this.name = name;
        this.other_names = otherNames;
        this.person_path = person_path;
        this.researcher_urls = researcherUrls;
    }

    public CompactORCID(Distinctions distinctions,
                        Educations educations,
                        Employments employments,
                        Fundings fundings,
                        InvitedPositions invited_positions,
                        LastModifiedDate activity_last_modified_date,
                        Memberships memberships,
                        PeerReviews peer_reviews,
                        Qualifications qualifications,
                        ResearchResources research_resources,
                        Services services,
                        Works works,
                        Map<Long, ? extends Activity> activity_map) {
        this.distinctions = distinctions;
        this.educations = educations;
        this.employments = employments;
        this.fundings = fundings;
        this.invited_positions = invited_positions;
        this.activity_last_modified_date = activity_last_modified_date;
        this.memberships = memberships;
        this.peer_reviews = peer_reviews;
        this.qualifications = qualifications;
        this.research_resources = research_resources;
        this.services = services;
        this.works = works;
        this.activity_map = activity_map;
    }

    public void mergeORCIDPerson(CompactORCID o) {
        this.addresses = o.addresses;
        this.biography = o.biography;
        this.emails = o.emails;
        this.external_ids = o.external_ids;
        this.keywords = o.keywords;
        this.orcid_last_modified_date = o.orcid_last_modified_date;
        this.name = o.name;
        this.other_names = o.other_names;
        this.person_path = o.person_path;
        this.researcher_urls = o.researcher_urls;
    }

//    public void mergeORCIDActivity(CompactORCID o) {
//        this.distinctions = o.distinctions;
//        this.educations = o.educations;
//        this.employments = o.employments;
//        this.fundings = o.fundings;
//        this.invited_positions = o.invited_positions;
//        this.activity_last_modified_date = o.activity_last_modified_date;
//        this.memberships = o.memberships;
//        this.peer_reviews = o.peer_reviews;
//        this.qualifications = o.qualifications;
//        this.research_resources = o.research_resources;
//        this.services = o.services;
//        this.works = o.works;
//        this.activity_map = o.activity_map;
//    }

    public void mergeORCIDIdentifier(String[] orcid_id) {
        this.orcid_id_host = orcid_id[0];
        this.orcid_id_uri = orcid_id[1];
    }

    public CompactORCID(
            Boolean claimed,
            CompletionDate completionDate,
            CreationMethod creationMethod,
            DeactivationDate deactivationDate,
            LastModifiedDate lastModifiedDate,
            Source source,
            SubmissionDate submissionDate,
            boolean verifiedEmail,
            boolean verifiedPrimaryEmail) {
        this.claimed = claimed;
        this.completion_date = completionDate;
        this.creation_method = creationMethod;
        this.deactivation_date = deactivationDate;
        this.history_last_modified_date = lastModifiedDate;
        this.source = source;
        this.submission_date = submissionDate;
        this.verified_email = verifiedEmail;
        this.verified_primary_email = verifiedPrimaryEmail;
    }

    public void mergeORCIDHistory(CompactORCID o) {
        this.claimed = o.claimed;
        this.completion_date = o.completion_date;
        this.creation_method = o.creation_method;
        this.deactivation_date = o.deactivation_date;
        this.history_last_modified_date = o.history_last_modified_date;
        this.source = o.source;
        this.submission_date = o.submission_date;
        this.verified_email = o.verified_email;
        this.verified_primary_email = o.verified_primary_email;
    }

}
