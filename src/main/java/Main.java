import csvwriter.CSVCreator;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        CSVCreator csvCreator = new CSVCreator();
        HashMap<String, String> crewPositions = new LinkedHashMap<>();
        crewPositions.put("PRWorkplace_Groups", "High");
         crewPositions.put("VESSEL NAME", "High");
        crewPositions.put("REQUIREMENT_TYPE", "High");
        crewPositions.put("NUMBER_REQ", "High");
        crewPositions.put("LAST_NAME", "High");
        crewPositions.put("FULL_NAME", "High");
        crewPositions.put("ALTERNATE_NAME", "High");
        crewPositions.put("SEX", "High");
        crewPositions.put("MARITAL_STATUS", "High");
        crewPositions.put("DEFAULT_COMMENT", "High");
        crewPositions.put("GROUP_NAME", "High");
        crewPositions.put("BUSINESS_UNIT_ORG_NAME", "High");
        crewPositions.put("EMPLOYER_ORGANIZATION_NAME", "High");
        crewPositions.put("DATE_OF_HIRE", "High");
        crewPositions.put("SERVICE_SENIORITY_DATE", "High");
        crewPositions.put("GROUP_SENIORITY_DATE", "High");
        crewPositions.put("GROUP_SENIORITY_CODE", "High");
        crewPositions.put("POA_RECALL_DATE", "High");
        crewPositions.put("ACTUAL_TERMINATION_DATE", "High");
        crewPositions.put("LAST_DATE_WORKED", "High");
        crewPositions.put("DEFAULT_JOB", "High");
        crewPositions.put("DEFAULT_POA_LOCATOR_CODE", "High");
        crewPositions.put("DEFAULT_POA_PRWORKPLACES", "High");
        csvCreator.createCSVFile("C:\\Users\\user1111\\names.csv", crewPositions);
    }
}
