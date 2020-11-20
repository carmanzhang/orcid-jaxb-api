import org.orcid.jaxb.model.common.AvailableLocales;
import org.orcid.jaxb.model.common.OrcidType;
import org.orcid.jaxb.model.message.CreationMethod;
import org.orcid.jaxb.model.v3.release.common.LastModifiedDate;
import org.orcid.jaxb.model.v3.release.common.OrcidIdentifier;
import org.orcid.jaxb.model.v3.release.common.Source;
import org.orcid.jaxb.model.v3.release.record.Deprecated;
import org.orcid.jaxb.model.v3.release.record.*;
import org.orcid.jaxb.model.v3.release.record.summary.Educations;
import org.orcid.jaxb.model.v3.release.record.summary.Employments;
import org.orcid.jaxb.model.v3.release.record.summary.Works;
import org.orcid.jaxb.model.v3.release.record.summary.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.reflect.Method;
import java.util.Map;

public class MetadataCleaner {
    public static CompactORCID parser(Record record) {
        CompactORCID compactORCID = parseActivities(record);
        CompactORCID historyCompactORCID = parseHistory(record);
        compactORCID.mergeORCIDHistory(historyCompactORCID);
        String[] orcidIdentifer = parseOrcidIdentifer(record);
        compactORCID.mergeORCIDIdentifier(orcidIdentifer);
        CompactORCID personCompactORCID = parsePerson(record);
        compactORCID.mergeORCIDPerson(personCompactORCID);

//        parseDeprecated(record);
        String path = parsePath(record);
        String locale = parsePerference(record);
        String orcidType = parseOrcidType(record);
        compactORCID.path = path;
        compactORCID.locale = locale;
        compactORCID.orcid_type = orcidType;
        return compactORCID;
    }

    private static String parsePath(Record record) {
        if (record == null) {
            return null;
        }
        return record.getPath();
    }

    private static String parseOrcidType(Record record) {
        if (record == null) {
            return null;
        }
        OrcidType orcidType = record.getOrcidType();
        if (orcidType == null) {
            return null;
        }
        return orcidType.value();
    }

    private static String parseDeprecated(Record record) {
        if (record == null) {
            return null;
        }
        Deprecated deprecated = record.getDeprecated();
        if (deprecated == null) {
            return null;
        }
        DeprecatedDate deprecatedDate = deprecated.getDeprecatedDate();

        XMLGregorianCalendar value = deprecatedDate.getValue();

        String s = value.toXMLFormat();
        PrimaryRecord primaryRecord = deprecated.getPrimaryRecord();
        return null;
    }

    private static String parsePerference(Record record) {
        if (record == null) {
            return null;
        }
        Preferences preferences = record.getPreferences();
        if (preferences == null) {
            return null;
        }
        AvailableLocales locale = preferences.getLocale();
        if (locale == null) {
            return null;
        }
        return locale.value();
    }

    public static <T> T mutePathMetadata(T t) {
        if (t == null) {
            return null;
        }
        try {
            Method[] declaredMethods = t.getClass().getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                if ("setPath".equalsIgnoreCase(declaredMethod.getName())) {
//                    f.setAccessible(false);
                    declaredMethod.invoke(t, (Object) null);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return t;
    }

    private static CompactORCID parsePerson(Record record) {
        if (record == null) {
            return null;
        }
        Person person = record.getPerson();
        if (person == null) {
            return null;
        }

        Addresses addresses = mutePathMetadata(person.getAddresses());
        Biography biography = mutePathMetadata(person.getBiography());
        Emails emails = mutePathMetadata(person.getEmails());
        PersonExternalIdentifiers externalIdentifiers = mutePathMetadata(person.getExternalIdentifiers());
        Keywords keywords = mutePathMetadata(person.getKeywords());
        LastModifiedDate lastModifiedDate = mutePathMetadata(person.getLastModifiedDate());
        Name name = mutePathMetadata(person.getName());
        OtherNames otherNames = mutePathMetadata(person.getOtherNames());
        String path = mutePathMetadata(person.getPath());
        ResearcherUrls researcherUrls = mutePathMetadata(person.getResearcherUrls());
        return new CompactORCID(addresses, biography, emails, externalIdentifiers, keywords, lastModifiedDate, name, otherNames, path, researcherUrls);
    }

    private static String[] parseOrcidIdentifer(Record record) {
        if (record == null) {
            return null;
        }
        OrcidIdentifier orcidIdentifier = record.getOrcidIdentifier();
        if (orcidIdentifier == null) {
            return null;
        }

        String host = orcidIdentifier.getHost();
//        String path = orcidIdentifier.getPath();
        String uri = orcidIdentifier.getUri();
        return new String[]{host, uri};
    }

    private static CompactORCID parseHistory(Record record) {
        if (record == null) {
            return null;
        }
        History history = record.getHistory();
        if (history == null) {
            return null;
        }

        boolean claimed = history.getClaimed();
        CompletionDate completionDate = mutePathMetadata(history.getCompletionDate());
        CreationMethod creationMethod = mutePathMetadata(history.getCreationMethod());
        DeactivationDate deactivationDate = mutePathMetadata(history.getDeactivationDate());
        LastModifiedDate lastModifiedDate = mutePathMetadata(history.getLastModifiedDate());
        Source source = mutePathMetadata(history.getSource());
        SubmissionDate submissionDate = mutePathMetadata(history.getSubmissionDate());
        boolean verifiedEmail = history.isVerifiedEmail();
        boolean verifiedPrimaryEmail = history.isVerifiedPrimaryEmail();
        return new CompactORCID(claimed, completionDate, creationMethod, deactivationDate, lastModifiedDate, source, submissionDate, verifiedEmail, verifiedPrimaryEmail);
    }

    private static CompactORCID parseActivities(Record record) {
        if (record == null) {
            return null;
        }
        ActivitiesSummary activitiesSummary = record.getActivitiesSummary();
        if (activitiesSummary == null) {
            return null;
        }
//        String path1 = activitiesSummary.getPath();
        Distinctions distinctions = mutePathMetadata(activitiesSummary.getDistinctions());
        Educations educations = mutePathMetadata(activitiesSummary.getEducations());
        Employments employments = mutePathMetadata(activitiesSummary.getEmployments());
        Fundings fundings = mutePathMetadata(activitiesSummary.getFundings());
        InvitedPositions invitedPositions = mutePathMetadata(activitiesSummary.getInvitedPositions());
        LastModifiedDate lastModifiedDate = mutePathMetadata(activitiesSummary.getLastModifiedDate());
        Memberships memberships = mutePathMetadata(activitiesSummary.getMemberships());
        PeerReviews peerReviews = mutePathMetadata(activitiesSummary.getPeerReviews());
        Qualifications qualifications = mutePathMetadata(activitiesSummary.getQualifications());
        ResearchResources researchResources = mutePathMetadata(activitiesSummary.getResearchResources());
        Services services = mutePathMetadata(activitiesSummary.getServices());
        Works works = mutePathMetadata(activitiesSummary.getWorks());
        Map<Long, ? extends Activity> longMap = activitiesSummary.retrieveActivitiesAsMap();
        return new CompactORCID(distinctions, educations, employments, fundings, invitedPositions, lastModifiedDate, memberships, peerReviews, qualifications, researchResources, services, works, longMap);
    }
}
