package com.example.marcus.gratisgoder_grp2;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class SearchResult_akt extends AppCompatActivity {


    TextView info , description;
    ScrollView infoScroll , descriptionScroll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result_akt);
        setTitle("Sommerferie på Naturcenter Amager Strand");
        ActionBar aBar = getSupportActionBar();
        aBar.setDisplayHomeAsUpEnabled(true);
        aBar.setDisplayShowHomeEnabled(true);
        infoScroll = (ScrollView) findViewById(R.id.info_scroll);
        descriptionScroll = (ScrollView) findViewById(R.id.description_scroll);
        info = new TextView(this);
        description = new TextView(this);
        String infoStr = "Landsdel\n Storkøbenhavn\n" +
                         "Kategori\n Oplevelses center\n" +
                         "Addresse\n Øresundsstien 7\n" +
                "2300 København S\n" +
                "Telefon: 29282117\n" +
                "Hjemmeside\n www.naturcenteramagerstrand.dk\n" +
                "Email\n naturcenteramagerstrand@skoletjenesten.dk";
        String descrStr = "Naturcenter Amager Strand ønsker at gøre børn " +
                "klogere på strandens natur. Det sker " +
                "gennem lærerige og nærværende naturoplevelser. " +
                "Vi holder åbent alle dage i hele sommerferien, hvor " +
                "børn kan opleve og deltage i alverdens aktiviteter omkring " +
                "strandens natur. Sommerferieprogrammet består bl.a. af, at man " +
                "kan komme ud i waders sammen med sin mor og far. Tag med på " +
                "ét af vores waders-sommerhold og lær at gå på jagt efter dyrene " +
                "på det lave vand sammen med vores undervisere. Tilmelding foregår " +
                "her: goo.gl/EQFyDJ (eller via linket på vores hjemmeside). Man kan også " +
                "forsøge at fange Amager Strands største krabbe med en hjemmelavet krabbefiskestang, " +
                "som man kan lave ude på naturcenteret. Vinderen af konkurrencen offentliggøres på Naturens" +
                " Dag d. 10. september. Der er en privat guidetur i waders på højkant! Man kan prøve at fange " +
                "så mange forskellige dyr som muligt med ét af vores sænkenet og notere det på vores fælles oversigt. " +
                "Man kan lave sin egen undervandskikkert, som man kan tage med hjem og bruge igen og igen i løbet af" +
                " sommeren. Oplev mange andre sjove og lærerige naturaktiviteter! Hele sommeren kan man købe sit helt " +
                "eget udstyr i vores nye butik - vi garanterer en ordentlig kvalitet. Det er altid gratis at komme " +
                "og være med, og det hele foregår mellem kl. 10 og 14 hver dag mellem uge 26 og 32. Vi ses på Amager Strand! ";
        info.setText(infoStr);
        description.setText(descrStr);
        infoScroll.removeAllViews();
        descriptionScroll.removeAllViews();
        infoScroll.addView(info);
        descriptionScroll.addView(description);

    }
}
