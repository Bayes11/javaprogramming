package day31_CustomClassConstructors;

import java.util.ArrayList;

public class OfferObject {

    public static void main(String[] args) {

        Offer offer1 = new Offer();

        offer1.setInfo("Madrid", "RTR", "Engineer", 24000, true, false, true, true);

        Offer offer2 = new Offer();

        offer2.setInfo("Barcelona", "Ada", "QA", 30000, true, true, false, false);

        Offer offer3 = new Offer();

        offer3.setInfo("Cordoba", "H10Hotel", "Waiter", 12000, true, false, false, true);

        Offer offer4 = new Offer();

        offer4.setInfo("Seville", "Amazon", "Developer", 35000, true, true,true,true);

        Offer offer5 = new Offer();

        offer5.setInfo("Malaga", "Bar", "Camarero", 15000, false, true, true,false);

        Offer offer6 = new Offer();

        offer6.setInfo("Madrid" , "Apple", "QualityAssurance", 40000, true,true,true,true);

        Offer offer7 = new Offer();

        offer7.setInfo("Barcelona", "Microsoft", "Engineer", 27000, false, false, true, false);

        Offer [] offers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList <Offer> fullTimeOffers = new ArrayList<>();

        for (Offer each : offers) {
            fullTimeOffers.add(each);
        }
        fullTimeOffers.removeIf(p->!p.isFullTime);

        ArrayList <Offer> localOffers = new ArrayList<>();

        for (Offer each : offers) {
            localOffers.add(each);
        }

        localOffers.removeIf(p->!p.location.equalsIgnoreCase("Madrid"));

        ArrayList <Offer> offersWithBenefit = new ArrayList<>();

        for (Offer each : offers) {
            offersWithBenefit.add(each);
        }

        offersWithBenefit.removeIf(p->!p.hasBenefit);


        ArrayList <Offer> qaOffers = new ArrayList<>();

        for (Offer each : offers) {
            qaOffers.add(each);
        }

        qaOffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("QA"));

        ArrayList <Offer> offersWith100k = new ArrayList<>();

        for (Offer each : offers) {
            offersWith100k.add(each);
        }

        offersWith100k.removeIf(p->p.salary<100000);






        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println("localOffers = " + localOffers);
        System.out.println("offersWithBenefit = " + offersWithBenefit);
        System.out.println("qaOffers = " + qaOffers);
        System.out.println("offersWith100k = " + offersWith100k);






    }


}
