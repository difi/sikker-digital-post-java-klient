package no.difi.sdp.client.domain;

import java.security.Signature;
import java.util.Date;

public class ForretningsKvittering {

    private Date tidspunkt;
    private ApningsStatus status;

    /**
     * Beskrivelse av varslingen som feilet. Dette feltet er kun satt dersom {@link #status} er {@link no.difi.sdp.client.domain.ApningsStatus#VARSEL_FEILET}.
     */
    private VarslingFeiletKvittering varslingFeiletKvittering;

    /**
     * TODO: Ønsker vi å tilgjengeliggjøre signatur her? I så fall bør vi kanskje gjøre det for alle responser?
     */
    private Signature signature;

}
