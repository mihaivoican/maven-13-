package homework13;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

    @RequiredArgsConstructor        //constructor pt argumentele required
    @Getter     //scrie gettere pt toate campurile
    public class Quote {
        private final int id;       //nu se seteaza de aceea e pus final; la fel si cele ce urmeaza
        private final String author;
        private final String quote;
        @Setter         //setter pt campul de setat
        private boolean favorite;
    }

