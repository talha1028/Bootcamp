public class TASK8 {
    public static void main(String[] args){
        double total_pop = 80000;
        double men_pop = 0.52 * total_pop;
        double women_pop = 0.48 * total_pop;
        double literate_men = 0.35 * total_pop;
        double total_literate_people = 0.48 * total_pop;
        double literate_women = total_literate_people - literate_men;
        double illiterate_women = women_pop - literate_women;
        double illiterate_men = men_pop - literate_men;

        System.out.println(illiterate_men);
        System.out.println(illiterate_women);

    }
}