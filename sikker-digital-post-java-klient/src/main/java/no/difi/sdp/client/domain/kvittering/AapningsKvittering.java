/**
 * Copyright (C) Posten Norge AS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package no.difi.sdp.client.domain.kvittering;

import no.digipost.api.representations.EbmsApplikasjonsKvittering;

import java.util.Date;

public class AapningsKvittering extends ForretningsKvittering {

    private AapningsKvittering(EbmsApplikasjonsKvittering applikasjonsKvittering) {
        super(applikasjonsKvittering);
    }

    public Date getTidspunkt() {
        return applikasjonsKvittering.getStandardBusinessDocument().getKvittering().kvittering.getTidspunkt().toDate();
    }

    public static Builder builder(EbmsApplikasjonsKvittering applikasjonsKvittering) {
        return new Builder(applikasjonsKvittering);
    }

    public static class Builder {
        private AapningsKvittering target;
        private boolean built = false;

        public Builder(EbmsApplikasjonsKvittering applikasjonsKvittering) {
            target = new AapningsKvittering(applikasjonsKvittering);
        }

        public AapningsKvittering build() {
            if (built) throw new IllegalStateException("Can't build twice");
            built = true;
            return target;
        }
    }
}