package main.calenderApiConections;

import java.io.InputStream;

public class Authorization1 extends GlobalInstances1 {

    private InputStream in = GetCalenderData1.class.getResourceAsStream("/client_secret.json");
//    public Credential authorize() throws IOException {
//        GoogleAuthorizationCodeFlow flow = getGoogleAuthorizationCodeFlow();
//
//        Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
////        System.out.println("Credentials saved to " + DATA_STORE_DIR.getAbsolutePath());
//        return credential;
//    }
//
//    private GoogleAuthorizationCodeFlow getGoogleAuthorizationCodeFlow() throws IOException {
//        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
//
//        return new GoogleAuthorizationCodeFlow.Builder(
//                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
//                .setDataStoreFactory(DATA_STORE_FACTORY)
//                .setAccessType("online")
//                .build();
//    }

}
