package com.example.marcus.gratisgoder_grp2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchResult_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchResult_frag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ScrollView infoScroll, descriptionScroll;
    private TextView info , description;


    public SearchResult_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchResult_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchResult_frag newInstance(String param1, String param2) {
        SearchResult_frag fragment = new SearchResult_frag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_search_result_frag , container , false);

        infoScroll = (ScrollView) root.findViewById(R.id.info_scroll);
        descriptionScroll = (ScrollView) root.findViewById(R.id.description_scroll);
        info = new TextView(getActivity());
        description = new TextView(getActivity());
        //Placeholder text
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
        return root;
    }

}
