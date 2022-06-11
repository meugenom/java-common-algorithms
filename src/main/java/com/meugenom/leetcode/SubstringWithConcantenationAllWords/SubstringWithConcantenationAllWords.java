package com.meugenom.leetcode.SubstringWithConcantenationAllWords;

//import java.util.ArrayList
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

//hard

public class SubstringWithConcantenationAllWords {


    public List<Integer> findSubstring(String s, String[] words) {
        
        HashMap<String, Integer> map = new HashMap<>();        
        int len = words[0].length();
        int wordsLen = len * words.length;

        List<Integer> result = new LinkedList<>();
        
        for(String word: words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        for (int i = 0; i + wordsLen <= s.length(); i++) {
            String tmp = s.substring(i, i + wordsLen);
            if (containsWords(tmp, new HashMap<>(map), len)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    public boolean containsWords(String s, HashMap<String, Integer> map, int len) {
        
        boolean[] dp = new boolean[s.length()+1];
        Arrays.fill(dp, false);        
        dp[0] = true;

        for(int i = len; i <= s.length(); i+=len) {
            String tmp = s.substring(i-len, i);
            if (dp[i-len] && map.containsKey(tmp) && map.get(tmp) > 0) {
                map.put(tmp, map.get(tmp)-1);
                dp[i] = true;
            }
        }

        return dp[s.length()];
    }

    /*
    List<Integer> result = new ArrayList<>(); 
    List<String> usedWords = new ArrayList<>();         
    
    String searchString ="";
    int searchIndex = 0;   
    String cash = "";
    int max_length_of_phrase = 0;
    
    
    public List<Integer> findSubstring(String s, String[] words) {
       
        if(words.length==1 && s.equals(words[0])){                        
            result.add(0);
            return result;
        }
            
        for(int i=0; i < words.length; i++){
            max_length_of_phrase = max_length_of_phrase + words[i].length();
        }

        
        
        int number_Symbols = 0;                        
        while(number_Symbols < s.length()){ 
            searchString = searchString +  s.charAt(number_Symbols);                           
            this.findIndex(searchString, words);                 

            number_Symbols++;
        }
        return result;
    }

    
    public void findIndex(String s, String[] words){
        
        int index = 0, step = 0;        
        
        while(index < words.length){
                                    
            if(s.indexOf(words[index], step) == step){
                        
                //if(!usedWords.contains(words[index])){ 
                    if(
                        //!usedWords.contains(words[index])
                        this.dpList(usedWords, words[index]) < this.dpArray(words, words[index])                    
                    ){ 

                        if(s.indexOf(cash + words[index], 0) == 0){
                            
                            usedWords.add(words[index]);
                            cash = cash + words[index];
                            //! important                                                    
                            if(cash.length() < max_length_of_phrase){
                                step = cash.length();
                                index = -1; //restart when our step was changed                                                            
                            }                            
                        }                                                
                }                                            
            }               
            index++;
        }

        if(usedWords.size() == words.length){
            // full cash ...
            // need save word and index and cut the string
            // and clear cash array

            System.out.println("String found: " + cash);            
            
            result.add(searchIndex);
        
            
            //substring searchString and searchIndex...            
            
            String firstElem = usedWords.get(0);                      
            if(
                //searchString.replaceFirst(firstElem, "").equals(firstElem
                !this.dpParts(firstElem, searchString)
                
                ){
                searchString = searchString.substring(1);
                searchIndex++;
            }else{
                searchString = searchString.replaceFirst(firstElem, "");              
                // need to make left index and 
                searchIndex = searchIndex + usedWords.get(0).length();

            }            
            
            // remove cashes
            usedWords.clear();
            cash = "";

        }else{

            if(s.length() - step > 0
            && s.length() >= max_length_of_phrase){
                //remove part of ... from the head
                searchString = searchString.substring(1);
                searchIndex++;                
            }
            //if not ...need clear cash            
            usedWords.clear();
            cash = "";
        }

    }

    public int dpList(List<String> arr, String s){
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(s == arr.get(i)){
                count++;                
            }
        }
        return count;
    }

    public int dpArray(String[] arr, String s){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(s == arr[i]){
                count++;                
            }
        }
        return count;
    }

    public boolean dpParts(String part, String str){
        String tmp = "";
        
        for(int i=0; i<str.length(); i++){
            tmp = tmp + str.charAt(i);
            if(tmp == part){
                return true;
            }
        }
        return false;
    }
    
    */

    public static void main(String[] args){
        System.out.println("-----------------------------------------");        
        SubstringWithConcantenationAllWords o = new SubstringWithConcantenationAllWords();        
        String s = "abbaaccbbaaabbcc";
        String[] words = new String[3];
        words[0] = "aa";
        words[1] = "bb";
        words[2] = "cc";

        
        System.out.println("String: "+s);
        System.out.println(o.findSubstring(s, words));
        //System.out.println(o.result);
        
        /*
        System.out.println("-----------------------------------------");
        
        String s2 = new String();
         s2= "pjzkrkevzztxductzzxmxsvwjkxpvukmfjywwetvfnujhweiybwvvsrfequzkhossmootkmyxgjgfordrpapjuun"+
         "mqnxxdrqrfgkrsjqbszgiqlcfnrpjlcwdrvbumtotzylshdvccdmsqoadfrpsvnwpizlwszrtyclhgilklydbmfhuywotjmktn"+
         "wrfvizvnmfvvqfiokkdprznnnjycttprkxpuykhmpchiksyucbmtabiqkisgbhxngmhezrrqvayfsxauamp"+
         "dpxtafniiwfvdufhtwajrbkxtjzqjnfocdhekumttuqwovfjrgulhekcpjszyynadxhnttgmnxkduqmmyhzfnjhducesct"+
         "ufqbumxbamalqudeibljgbspeotkgvddcwgxidaiqcvgwykhbysjzlzfbupkqunuqtraxrlptivshhbihtsigtpipguhbhctcvub"+
         "nhqipncyxfjebdnjyetnlnvmuxhzsdahkrscewabejifmxombiamxvauuitoltyymsarqcuuoezcbqpdaprxmsrickwpgwpsoplhugbik"+
         "bkotzrtqkscekkgwjycfnvwfgdzogjzjvpcvixnsqsxacfwndzvrwrycwxrcismdhqapoojegggkocyrdtkzmiekhxoppctytvphjynrhtc"+
         "vxcobxbcjjivtfjiwmduhzjokkbctweqtigwfhzorjlkpuuliaipbtfldinyetoybvugevwvhhhweejogrghllsouipabfafcxnhukcbtmxzsh"+
         "oyyufjhzadhrelweszbfgwpkzlwxkogyogutscvuhcllphshivnoteztpxsaoaacgxyaztuixhunrowzljqfqrahosheukhahhbiaxqzfmmwcjx"+
         "ountkevsvpbzjnilwpoermxrtlfroqoclexxisrdhvfsindffslyekrzwzqkpeocilatftymodgztjgybtyheqgcpwogdcjlnlesefgvimwbxcb"+
         "zvaibspdjnrpqtyeilkcspknyylbwndvkffmzuriilxagyerjptbgeqgebiaqnvdubrtxibhvakcyotkfonmseszhczapxdlauexehhaireihxs"+
         "plgdgmxfvaevrbadbwjbdrkfbbjjkgcztkcbwagtcnrtqryuqixtzhaakjlurnumzyovawrcjiwabuwretmdamfkxrgqgcdgbrdbnugzecbgyxxdqm"+
         "isaqcyjkqrntxqmdrczxbebemcblftxplafnyoxqimkhcykwamvdsxjezkpgdpvopddptdfbprjustquhlazkjfluxrzopqdstulybnqvyknrchbp"+
         "hcarknnhhovweaqawdyxsqsqahkepluypwrzjegqtdoxfgzdkydeoxvrfhxusrujnmjzqrrlxglcmkiykldbiasnhrjbjekystzilrwkzhontwmehrfs"+
         "rzfaqrbbxncphbzuuxeteshyrveamjsfiaharkcqxefghgceeixkdgkuboupxnwhnfigpkwnqdvzlydpidcljmflbccarbiegsmweklwngvygbqpe"+
         "scpeichmfidgsjmkvkofvkuehsmkkbocgejoiqcnafvuokelwuqsgkyoekaroptuvekfvmtxtqshcwsztkrzwrpabqrrhnlerxjojemcxel";
        String[] w2 = new String[18];
        w2[0] = "dhvf";
        w2[1] = "sind";
        w2[2] = "ffsl";
        w2[3] = "yekr";
        w2[4] = "zwzq";
        w2[5] = "kpeo";
        w2[6] = "cila";
        w2[7] = "tfty";
        w2[8] = "modg";
        w2[9] = "ztjg";
        w2[10] = "ybty";
        w2[11] = "heqg";
        w2[12] = "cpwo";
        w2[13] = "gdcj";
        w2[14] = "lnle";
        w2[15] = "sefg";
        w2[16] = "vimw";
        w2[17] = "bxcb";
         
         SubstringWithConcantenationAllWords l = new SubstringWithConcantenationAllWords();           
         System.out.println("String: "+s2);
         System.out.println(l.findSubstring(s2, w2));
         //System.out.println(l.result);         

        
         System.out.println("-----------------------------------------");
         
        SubstringWithConcantenationAllWords k = new SubstringWithConcantenationAllWords();  
            String s1 = new String();
            s1="barfoofoobarthefoobarman";
            
            String[] w = new String[3];
            w[0] = "bar";
            w[1] = "foo";
            w[2] = "the";
            
            System.out.println("String: "+s1);
         k.findSubstring(s1, w);
         System.out.println(k.result);         

         System.out.println("-------------------o3----------------------");

         SubstringWithConcantenationAllWords g = new SubstringWithConcantenationAllWords();  
         String s3 = new String();
         s3="wordgoodgoodgoodbestword";
         

         String[] w3 = new String[4];
         w3[0] = "word";
         w3[1] = "good";
         w3[2] = "best";
         w3[3] = "good";
         
         System.out.println("String: "+s3);
            g.findSubstring(s3, w3);
            System.out.println(g.result);  
    
        System.out.println("--------------------o4---------------------");
        SubstringWithConcantenationAllWords o4 = new SubstringWithConcantenationAllWords();  
        String s4 = new String();
        s4="a";
        
        String[] w4 = new String[1];
        w4[0] = "a";
            
        System.out.println("String: "+s4);
        o4.findSubstring(s4, w4);
        System.out.println(o4.result);  
      
        System.out.println("--------------------o5---------------------");
        SubstringWithConcantenationAllWords o5 = new SubstringWithConcantenationAllWords();  
        String s5 = new String();
        s5="aaaaaaaaaaaaaa";

        
        String[] w5 = new String[2];
        w5[0] = "aa";
        w5[1] = "aa";
            
        System.out.println("String: "+s5);
        o5.findSubstring(s5, w5);
        System.out.println(o5.result);  

        System.out.println("--------------------o6---------------------");
        SubstringWithConcantenationAllWords o6 = new SubstringWithConcantenationAllWords();  
        String s6 = new String();
        s6="aaa";

        
        String[] w6 = new String[2];
        w6[0] = "a";
        w6[1] = "a";
            
        System.out.println("String: "+s6);
        o6.findSubstring(s6, w6);
        System.out.println(o6.result);  

        System.out.println("--------------------o7---------------------");
        SubstringWithConcantenationAllWords o7 = new SubstringWithConcantenationAllWords();  
        String s7 = new String();
        s7="aaaaaaaa";

        String[] w7 = new String[3];
        w7[0] = "aa";
        w7[1] = "aa";
        w7[2] = "aa";
            
        System.out.println("String: "+s7);
        o7.findSubstring(s7, w7);
        System.out.println(o7.result);  

        System.out.println("--------------------o8---------------------");
        SubstringWithConcantenationAllWords o8 = new SubstringWithConcantenationAllWords();  
        String s8 = new String();
    
        s8 = "ejwwmybnorgshugzmoxopwuvshlcwasclobxmckcvtxfndeztdqiakfusswqsovdfwatanwxgtctyjvsmlcoxijrahivwfybbbudosawnfpmomgczirzscqvlaqhfqkithlhbodptvdhjljltckogcjsdbbktotnxgwyuapnxuwgfirbmdrvgapldsvwgqjfxggtixjhshnzphcemtzsvodygbxpriwqockyavfscvtsewyqpxlnnqnvrkmjtjbjllilinflkbfoxdhocsbpirmcbznuioevcojkdqvoraeqdlhffkwqbjsdkfxstdpxryixrdligpzldgtiqryuasxmxwgtcwsvwasngdwovxzafuixmjrobqbbnhwpdokcpfpxinlfmkfrfqrtzkhabidqszhxorzfypcjcnopzwigmbznmjnpttflsmjifknezrneedvgzfmnhoavxqksjreddpmibbodtbhzfehgluuukupjmbbvshzxyniaowdjamlfssndojyyephstlonsplrettspwepipwcjmfyvfybxiuqtkdlzqedjxxbvdsfurhedneauccrkyjfiptjfxmpxlssrkyldfriuvjranikluqtjjcoiqffdxaukagphzycvjtvwdhhxzagkevvuccxccuoccdkbboymjtimdrmerspxpktsmrwrlkvpnhqrvpdekmtpdfuxzjwpvqjjhfaupylefbvbsbhdncsshmrhxoyuejenqgjheulkxjnqkwvzznriclrbzryfaeuqkfxrbldyusoeoldpbwadhrgijeplijcvqbormrqglgmzsprtmryvkeevlthvflsvognbxfjilwkdndyzwwxgdbeqwlldyezmkopktzugxgkklimhhjqkmuaifnodtpredhqygmedtqpezboimeuyyujfjxkdmbjpizpqltvgknnlodtbhnbhjkmuhwxvzgmkhbcvvadhnssbvneecglnqxhavhvxpkjxlluilzpysjcnwguyofnhfvhaceztoiscumkhociglkvispihvyoatxcxbeqsmluixgsliatukrecgoldmzfhwkgaqzsckonjuhxdhqztjfxstjvikdrhpyjfxbjjryslfpqoiphrwfjqqhaamrjbrsiovrxmqsyxhqmritjeauwqbwtpqcqhvyyssvfknfhxvtodpzipueixdbntdfcaeatyyainfpkclbgaaqrwwzwbcjwiqzkwzfuxfclmsxpdyvfbnwxjytnaejivivriamhgqsskqhnqeurttrfrmstrbeokzhuzvbfmwywohmgogyhzpmsdemugqkspsmoppwbnwabdmiruibwznqcuczculujfiavzwynsyqxmarjkshjhxobandwyzggjibjgzyaaqxorqxbkenscbveqbaociwmqxxyzvyblypeongzrttvwqzmrccwkzidyfbxcaypyquodcpwxkstbthuvjqgialhfmgjohzoxvdaxuywfqrgmyahhtpqtazbphmfoluliznftodyguesshcacrsvutylalqrykehjuofisdookjhrljvedsywrlyccpaowjaqyfaqioesxnlkwgpbznzszyudpwrlgrdgwdyhucztsneqttsuirmjriohhgunzatyfrfzvgvptbgpwajgtysligupoqeoqxoyqtzozufvvlktnvahvsseymtpeyfvxttqosgpplkmxwgmsgtpantazppgnubmpwcdqkvhwfuvcahwibniohiqyywnuzzmxeppokxksrfwrpuzqhjgqryorwboxdauhrkxehiwaputeouwxdfoudcoagcxjcuqvenznxxnprgvhasffxtzaxpcfrcovwgrcwqptoekhmgpoywtxruxokcubekzcrqengviwbtgnzvdzrwwkqvacxwgdhffyvjldgvchoiwnfzoyvkiogisdfyjmfomcazigukqlumyzmnzjzhzfpslwsukykwckvktswjdqxdrlsqvsxwxpqkljeyjpulbswwmuhplfueqnvnhukgjarxlxvwmriqjgmxawmndhsvwnjdjvjtxcsjapfogpesxtpypenunfpjuyoevzztctecilqqbxkaqcyhiobvtqgqruumvvhxolbyzsqcrdchhdqprtkkjsccowrjtyjjmkhleanvfpemuublnnyzfabtxsestncfalqenfcswgerbfcqsapzdtscnzugmwlmidtxkvqhbuaecevwhmwkfqmvpgbefpqpsjmdecmixmmbsjxzwvjdmxydechlraajjmoqpcyoqmrjwoiumuzatydzcnktnkeyztoqvogodxxznhvzduzxudwwqhpftwdspuimioanlzobhjakgajafgzxpqckmhdbbnqmcszpuoqbztnftzgahhxwxbgkilnmzfydyxusnnvngksbjabqjaohdvrniezhmxmkxhemwbbclwdxwgngicplzgajmaryzfkyoqlkrmmfirchzrphveuwmvgaxzbwenvteifxuuefnimnadwxhruvoavlzyhfmeasmgrjawongccgfbgoualiaivbhcgvjjnxpggrewglalthmzvgziobrjeanlvyukwlscexbkibvdjhdgnepdiimmkcxhattwglbkicvsfswocbvphmtpwhcgjbnmxgidtlqcnnwtfujhvgzdussqbwynylzvtjapvqtidpdjkpshvrmqlhindhabubyokzdfrwqvnvgzkyhistydagsgnujiviyijdnabfxqbdqnexvwsvzvcsbrmkbkuzsdehghndyqjodnnblfwmaygdstotfkvxozgwhtbhlkvrzismnozqpfthajafuxekzlgigjpsukjvsdihrjzgovnreqwapdkoqswyclqyvbvpedzyoyedvuuamscbxnqnfmmjyehvidnoimmxmtcinwkbqmcobubjjpshucechrqrffqsyscnqoohcsxenypyqhfklloudgmklcejvgynwouzhtfwuuukdbwpmkjrqxeeaipxrokncholathupdetgaktmvmftqjvzyssocftjwemroghrncynmtchhhcaqxbqpthuaafwgrouaxonzocljeuslzsdwvuoodipdpnlhdihaywzmymxdjrqikughquwtenyucjdgrmipiidiwclhuepgyynoslhzahtdqwliktzsddaahohbszhqxxgripqlwlomjbwtuynydoakejmwkvojuwbfltqjfgxqhwkduzbxpdhtpvrzrfjndmsqfizmqxdxtpbpoemekvxzrrakwjxcxqsdasptruqmjtbaapgmkfnbwnlvzlxwdpzfjryanrmzmpzoefapmnsjdgecrdywsabctaegttffigupnwgakylngrrxurtotxqmzxvsqazajvrwsxyeyjteakeudzjxwbjvagnsjntskmocmpgkybqbnwvrwgoskzqkgffpsyhfmxhymqinrbohxlytsmoeleqrjvievpjipsgdkrqeuglrsjnmvdsihicsgkybcjltcswolpsfxdypmlbjotuxewskisnmczfgreuevnjssjifvlqlhkllifxrxkdbjlhcpegmtrelbosyajljvwwedtxbdccpnmreqaqjrxwulpunagwxesbilalrdniqbzxrbpcvmzpyqklsskpwctgqtrjwhrpisocwderqfiqxsdpkphjsapkvhvsqojyixaechvuoemmyqdlfkuzmlliugckuljfkljoshjhlvvlnywvjswvekfyqhjnsusefdtakejxbejrchoncklguqgnyrcslwztbstmycjziuskegagtlonducdogwbevugppsptdqbajmepmmizaycwcgmjeopbivsyphtvxvvgjbyxpgwpganjiaumojpyhhywosrmnouwpstgbrvhtlqcnmqbygbfnabesvshjmdbhyhirfrkqkmfwdgujhzyjdcbyuijjnkqluaczrnrbbwaeeupnwqzbsazplkyaxqorqsshhlljjlpphhedxdepgfgrqerpuhgmaawhnhqwsgnznrfmxjbdrkwjopylxezxgvetcvrwdewsxdeumhzfrvoilmvksuhyqltuimrnsphqslmgvmmojawwptghonigbdclqtbikiacwpjrbxhmzejozpypfixglatdvuogdoizdtsgsztsfcihtgwyqugeuahpuvvzmgarbsyuutmbxuisdfrvbxzxzhmuektssuktoknkfbmcwwubbnwenybmfqglaceuyqnoadzfenjcjfdlvcpiatuhjdujhaffqsvqvuxchgerokejovrqonxxstibunikiedfyahijobxyhimebctobsjudkqstbcxgixgrhpfiofpwruzvpqyjzvollheoldutddnksutjakhtghpxxnjykxjwgqmsvhnykclexepxqxqzghwfxfdhfmflesfabvanxlrurjtigkjotftqnwyskffpxlragrnfffawqtgyfpmzxfpkdpenxlewyxxgrkmwrmshhzfnorolyfxbvdrspxqnxnuoygkruczddgssygfymdcjgvdxutlrhffhnpyjuxmxefrelxezcgikdliyhvpocvvpkvagvmezrxffujeysplvavtjqjxsgujqsjznxforctwzecxyrkwufpdxadrgzczrnyelfschnagucguuqqqwitviynrypsrdswqxqsegulcwrwsjnihxedfcqychqumiscfkwmqqxunqrfbgqjdwmkyelbldxympctbzfupeocwhkypchuyvhybsbmvymjppfrqmlfrbkpjwpyyytytawuuyjrwxboogfessmltwdcssdqtwomymjskujjtmxiueopwacrwfuqazitvyhvlspvoaeipdsjhgyfjbxhityisidnhlksfznubucqxwaheamndjxmcxwufajmnveuwuoyosqnoqwvtjkwuhkzghvmjhawcfszbhzrbpgsidnbmxxihihnrfbamcyojqpkzodbejtmmipahojoysepzhpljpaugrghgjimtdahnpivdtlcnptnxjyiaafislqavamqgmxtdfoiaakorebqpbbpegawrqymqkewycsdjglkiwaacdqterkixkgraedtqirqmjtvsfhadhafktyrmkzmvidxmisfskvevpcnujqxrqedleuyowkjgphsxzzqlvujkwwgiodbfjesnbsbzcnftuzrvzjjudsgcqmmfpnmyrenuxotbbyvxyovzxgtcyzgqnsvcfhczoptnfnojnlinbfmylhdlijcvcxzjhdixuckaralemvsnbgooorayceuedtomzyjtctvtwgyiesxhynvogxnjdjphcftbefxgasawzagfugmuthjahylkhatlgpnkuksuesrduxkodwjzgubpsmzzmvkskzeglxaqrrvmrgcwcnvkhwzbibaxwnriowoavosminabvfxastkcrkdclgzjvqrjofjjvbyfragofeoazzeqljuypthkmywaffmcjkickqqsuhsviyovhitxeajqahshpejaqtcdkuvgdpclnsguabtgbfwdmrmbvydorfrbcokfdmtsgboidkpgpnmdeyhawkqqshtwxdbarwuxykgduxjlkxppwyruihkcqgynjcpbylayvgdqfpbqmshksyfbhrfxxemhgbkgmkhjtkzyzdqmxxwqvdtevyducpdksntgyaqtkrrkwiyuhukfadjvdnrievszilfinxbyrvknfihmetreydbcstkwoexwsfhfekfvfplmxszcosgovisnbemrjlndqwkvhqsofdbdychmupcsxvhazvrihhnxfyumonbvqeyoghccxfuwacxzxqkezxefxarnnujgyjugrzjoefmghjfhcrnbrtgouaehwnnxwkdplodpuqxdbemfwahptpfppjzowoltyqijfoabgzejerpatwponuefgdtcrgxswiddygeeflpjeelzccnsztxfyqhqyhkuppapvgvdtkmxraytcolbhkiiasaazkvqzvfxbaaxkoudovxrjkusxdazxaawmvoostlvvnsfbpjqkijvudpriqrfsrdfortimgdhtypunakzituezjyhbrpuksbamuiycngvlvpyvczfxvlwhjgicvempfobbwadkiavdswyuxdttoqaaykctprkwfmyeodowglzyjzuhencufcwdobydslazxadnftllhmjslfbrtdlahkgwlebdpdeofidldoymakfnpgekmsltcrrnxvspywfggjrmxryybdltmsfykstmlnzjitaipfoyohkmzimcozxardydxtpjgquoluzbznzqvlewtqyhryjldjoadgjlyfckzbnbootlzxhupieggntjxilcqxnocpyesnhjbauaxcvmkzusmodlyonoldequfunsbwudquaurogsiyhydswsimflrvfwruouskxjfzfynmrymyyqsvkajpnanvyepnzixyteyafnmwnbwmtojdpsucthxtopgpxgnsmnsrdhpskledapiricvdmtwaifrhnebzuttzckroywranbrvgmashxurelyrrbslxnmzyeowchwpjplrdnjlkfcoqdhheavbnhdlltjpahflwscafnnsspikuqszqpcdyfrkaabdigogatgiitadlinfyhgowjuvqlhrniuvrketfmboibttkgakohbmsvhigqztbvrsgxlnjndrqwmcdnntwofojpyrhamivfcdcotodwhvtuyyjlthbaxmrvfzxrhvzkydartfqbalxyjilepmemawjfxhzecyqcdswxxmaaxxyifmouauibstgpcfwgfmjlfhketkeshfcorqirmssfnbuqiqwqfhbmol";
        String[] w8 = new String[13];
        w8[0] = "toiscumkhociglkvispihvyoatxcx";
        w8[1] = "ndojyyephstlonsplrettspwepipw";
        w8[2] = "yzfkyoqlkrmmfirchzrphveuwmvga";
        w8[3] = "mxxihihnrfbamcyojqpkzodbejtmm";
        w8[4] = "fenjcjfdlvcpiatuhjdujhaffqsvq";
        w8[5] = "ehghndyqjodnnblfwmaygdstotfkv";
        w8[6] = "heoldutddnksutjakhtghpxxnjykx";
        w8[7] = "cvrwdewsxdeumhzfrvoilmvksuhyq";
        w8[8] = "ftqjvzyssocftjwemroghrncynmtc";
        w8[9] = "idiwclhuepgyynoslhzahtdqwlikt";
        w8[10] = "idiwclhuepgyynoslhzahtdqwlikt";
        w8[11] = "eurttrfrmstrbeokzhuzvbfmwywoh";
        w8[12] ="jxlluilzpysjcnwguyofnhfvhacez";



        //System.out.println("String: "+s8);
        o8.findSubstring(s8, w8);
        System.out.println(o8.result);  
        */
/*
"uskegagtlonducdogwbevugppsptd",
"xmcxwufajmnveuwuoyosqnoqwvtjk",
"wolpsfxdypmlbjotuxewskisnmczf",
"fjryanrmzmpzoefapmnsjdgecrdyw",
"jgmxawmndhsvwnjdjvjtxcsjapfog",
"wuhkzghvmjhawcfszbhzrbpgsidnb",
"yelbldxympctbzfupeocwhkypchuy",
"vzduzxudwwqhpftwdspuimioanlzo",
"bdpdeofidldoymakfnpgekmsltcrr",
"fmyeodowglzyjzuhencufcwdobyds",
"dhtypunakzituezjyhbrpuksbamui",
"bdmiruibwznqcuczculujfiavzwyn",
"eudzjxwbjvagnsjntskmocmpgkybq",
"tuynydoakejmwkvojuwbfltqjfgxq",
"psrdswqxqsegulcwrwsjnihxedfcq",
"cokfdmtsgboidkpgpnmdeyhawkqqs",
"fujhvgzdussqbwynylzvtjapvqtid",
"rqeuglrsjnmvdsihicsgkybcjltcs",
"vhybsbmvymjppfrqmlfrbkpjwpyyy",
"aukagphzycvjtvwdhhxzagkevvucc",
"hwkduzbxpdhtpvrzrfjndmsqfizmq",
"ywnuzzmxeppokxksrfwrpuzqhjgqr",
"qbajmepmmizaycwcgmjeopbivsyph",
"uamscbxnqnfmmjyehvidnoimmxmtc",
"nxvspywfggjrmxryybdltmsfykstm",
"amrjbrsiovrxmqsyxhqmritjeauwq",
"yorwboxdauhrkxehiwaputeouwxdf",
"qkewycsdjglkiwaacdqterkixkgra",
"ycngvlvpyvczfxvlwhjgicvempfob",
"jgphsxzzqlvujkwwgiodbfjesnbsb",
"mkxhemwbbclwdxwgngicplzgajmar",
"mryvkeevlthvflsvognbxfjilwkdn",
"mezrxffujeysplvavtjqjxsgujqsj",
"rtotxqmzxvsqazajvrwsxyeyjteak",
"sabctaegttffigupnwgakylngrrxu",
"xccuoccdkbboymjtimdrmerspxpkt",
"xusnnvngksbjabqjaohdvrniezhmx",
"oyuejenqgjheulkxjnqkwvzznricl",
"mxszcosgovisnbemrjlndqwkvhqso",
"wsgnznrfmxjbdrkwjopylxezxgvet",
"dxmisfskvevpcnujqxrqedleuyowk",
"dhrgijeplijcvqbormrqglgmzsprt",
"vuxchgerokejovrqonxxstibuniki",
"lumyzmnzjzhzfpslwsukykwckvkts",
"inwkbqmcobubjjpshucechrqrffqs",
"ywtxruxokcubekzcrqengviwbtgnz",
"ccpnmreqaqjrxwulpunagwxesbila",
"pesxtpypenunfpjuyoevzztctecil",
"sygfymdcjgvdxutlrhffhnpyjuxmx",
"uisdfrvbxzxzhmuektssuktoknkfb",
"cejvgynwouzhtfwuuukdbwpmkjrqx",
"oudcoagcxjcuqvenznxxnprgvhasf",
"sxnlkwgpbznzszyudpwrlgrdgwdyh",
"qqbxkaqcyhiobvtqgqruumvvhxolb",
"mkhleanvfpemuublnnyzfabtxsest",
"bibaxwnriowoavosminabvfxastkc",
"bcxgixgrhpfiofpwruzvpqyjzvoll",
"lzccnsztxfyqhqyhkuppapvgvdtkm",
"pdjkpshvrmqlhindhabubyokzdfrw",
"qbbnhwpdokcpfpxinlfmkfrfqrtzk",
"rnyelfschnagucguuqqqwitviynry",
"qtrjwhrpisocwderqfiqxsdpkphjs",
"vxttqosgpplkmxwgmsgtpantazppg",
"tyisidnhlksfznubucqxwaheamndj",
"kgaqzsckonjuhxdhqztjfxstjvikd","jeuslzsdwvuoodipdpnlhdihaywzm","vdzrwwkqvacxwgdhffyvjldgvchoi","cftbefxgasawzagfugmuthjahylkh","xraytcolbhkiiasaazkvqzvfxbaax","oyqtzozufvvlktnvahvsseymtpeyf","rnnujgyjugrzjoefmghjfhcrnbrtg","rfzvgvptbgpwajgtysligupoqeoqx","igbdclqtbikiacwpjrbxhmzejozpy","dyzwwxgdbeqwlldyezmkopktzugxg","hmetreydbcstkwoexwsfhfekfvfpl","zcnftuzrvzjjudsgcqmmfpnmyrenu","zzmvkskzeglxaqrrvmrgcwcnvkhwz","vjswvekfyqhjnsusefdtakejxbejr","rwwzwbcjwiqzkwzfuxfclmsxpdyvf","fdbdychmupcsxvhazvrihhnxfyumo","vdtevyducpdksntgyaqtkrrkwiyuh","nbvqeyoghccxfuwacxzxqkezxefxa","vpgbefpqpsjmdecmixmmbsjxzwvjd","jwgqmsvhnykclexepxqxqzghwfxfd","olyfxbvdrspxqnxnuoygkruczddgs","qgmxtdfoiaakorebqpbbpegawrqym","liaivbhcgvjjnxpggrewglalthmzv","choncklguqgnyrcslwztbstmycjzi","fpkdpenxlewyxxgrkmwrmshhzfnor","hhhcaqxbqpthuaafwgrouaxonzocl","ipahojoysepzhpljpaugrghgjimtd","wosrmnouwpstgbrvhtlqcnmqbygbf","nwyskffpxlragrnfffawqtgyfpmzx","bcvvadhnssbvneecglnqxhavhvxpk","hoavxqksjreddpmibbodtbhzfehgl","lazxadnftllhmjslfbrtdlahkgwle","uuukupjmbbvshzxyniaowdjamlfss","tpqtazbphmfoluliznftodyguessh","ychqumiscfkwmqqxunqrfbgqjdwmk","rkdclgzjvqrjofjjvbyfragofeoaz","pphhedxdepgfgrqerpuhgmaawhnhq","cacrsvutylalqrykehjuofisdookj","kyldfriuvjranikluqtjjcoiqffdx","bnwvrwgoskzqkgffpsyhfmxhymqin","uzmlliugckuljfkljoshjhlvvlnyw","abfxqbdqnexvwsvzvcsbrmkbkuzsd","xotbbyvxyovzxgtcyzgqnsvcfhczo","bwtpqcqhvyyssvfknfhxvtodpzipu","nsfbpjqkijvudpriqrfsrdfortimg","tgwyqugeuahpuvvzmgarbsyuutmbx","upnwqzbsazplkyaxqorqsshhlljjl","edfyahijobxyhimebctobsjudkqst","ialhfmgjohzoxvdaxuywfqrgmyahh","jlhcpegmtrelbosyajljvwwedtxbd","tpfppjzowoltyqijfoabgzejerpat","mgogyhzpmsdemugqkspsmoppwbnwa","nubmpwcdqkvhwfuvcahwibniohiqy","ukfadjvdnrievszilfinxbyrvknfi","dgnepdiimmkcxhattwglbkicvsfsw","syqxmarjkshjhxobandwyzggjibjg","bnwxjytnaejivivriamhgqsskqhnq","hzyjdcbyuijjnkqluaczrnrbbwaee","yscnqoohcsxenypyqhfklloudgmkl","habidqszhxorzfypcjcnopzwigmbz","wjdqxdrlsqvsxwxpqkljeyjpulbsw","tytawuuyjrwxboogfessmltwdcssd","pfixglatdvuogdoizdtsgsztsfcih","apkvhvsqojyixaechvuoemmyqdlfk","ouaehwnnxwkdplodpuqxdbemfwahp","ixuckaralemvsnbgooorayceuedto","ymxdjrqikughquwtenyucjdgrmipi","smrwrlkvpnhqrvpdekmtpdfuxzjwp","bhjakgajafgzxpqckmhdbbnqmcszp","beqsmluixgsliatukrecgoldmzfhw","greuevnjssjifvlqlhkllifxrxkdb","yzsqcrdchhdqprtkkjsccowrjtyjj","sviyovhitxeajqahshpejaqtcdkuv","qtwomymjskujjtmxiueopwacrwfuq","mzyjtctvtwgyiesxhynvogxnjdjph","dyfbxcaypyquodcpwxkstbthuvjqg","hfmflesfabvanxlrurjtigkjotftq","mxydechlraajjmoqpcyoqmrjwoium","nabesvshjmdbhyhirfrkqkmfwdguj","bhrfxxemhgbkgmkhjtkzyzdqmxxwq","gziobrjeanlvyukwlscexbkibvdjh","mcwwubbnwenybmfqglaceuyqnoadz","xyzvyblypeongzrttvwqzmrccwkzi","ncfalqenfcswgerbfcqsapzdtscnz","dtqpezboimeuyyujfjxkdmbjpizpq","wmuhplfueqnvnhukgjarxlxvwmriq","qwapdkoqswyclqyvbvpedzyoyedvu","uoqbztnftzgahhxwxbgkilnmzfydy","zsddaahohbszhqxxgripqlwlomjbw","bwadkiavdswyuxdttoqaaykctprkw","eixdbntdfcaeatyyainfpkclbgaaq","nmjnpttflsmjifknezrneedvgzfmn","avlzyhfmeasmgrjawongccgfbgoua","kklimhhjqkmuaifnodtpredhqygme","xzbwenvteifxuuefnimnadwxhruvo","ugmwlmidtxkvqhbuaecevwhmwkfqm","rhpyjfxbjjryslfpqoiphrwfjqqha","eeaipxrokncholathupdetgaktmvm","ltuimrnsphqslmgvmmojawwptghon","azitvyhvlspvoaeipdsjhgyfjbxhi","efrelxezcgikdliyhvpocvvpkvagv","znxforctwzecxyrkwufpdxadrgzcz","kcqgynjcpbylayvgdqfpbqmshksyf","hrljvedsywrlyccpaowjaqyfaqioe","cjmfyvfybxiuqtkdlzqedjxxbvdsf","zeqljuypthkmywaffmcjkickqqsuh","wnfzoyvkiogisdfyjmfomcazigukq","zyaaqxorqxbkenscbveqbaociwmqx","ahnpivdtlcnptnxjyiaafislqavam","edtqirqmjtvsfhadhafktyrmkzmvi","wponuefgdtcrgxswiddygeeflpjee","xozgwhtbhlkvrzismnozqpfthajaf","ptnfnojnlinbfmylhdlijcvcxzjhd","uxekzlgigjpsukjvsdihrjzgovnre","rbohxlytsmoeleqrjvievpjipsgdk","fxtzaxpcfrcovwgrcwqptoekhmgpo","tvxvvgjbyxpgwpganjiaumojpyhhy","vqjjhfaupylefbvbsbhdncsshmrhx","urhedneauccrkyjfiptjfxmpxlssr","ltvgknnlodtbhnbhjkmuhwxvzgmkh","ucztsneqttsuirmjriohhgunzatyf","rbzryfaeuqkfxrbldyusoeoldpbwa","atlgpnkuksuesrduxkodwjzgubpsm","lrdniqbzxrbpcvmzpyqklsskpwctg","qvnvgzkyhistydagsgnujiviyijdn","uzatydzcnktnkeyztoqvogodxxznh","ocbvphmtpwhcgjbnmxgidtlqcnnwt","koudovxrjkusxdazxaawmvoostlvv","ptruqmjtbaapgmkfnbwnlvzlxwdpz","xdxtpbpoemekvxzrrakwjxcxqsdas","gdpclnsguabtgbfwdmrmbvydorfrb","htwxdbarwuxykgduxjlkxppwyruih"]
*/
    }
}
