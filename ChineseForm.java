/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinesegame;

import java.awt.Color;
import java.util.ArrayList;

/**
 * 
 * @author lucas
 */
public class ChineseForm extends javax.swing.JPanel {

    private boolean pinyinVar;
    private final ArrayList<ArrayList<String>> set1, set2, set3, set4, set5, set6,
            set7, set8, set9, set10;
    private int current;
    private String pinyin;
    private int word;
    private ArrayList<ArrayList<String>> currentset;
    private int correct;
    private int numWrong;
    private boolean c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
    
    public ChineseForm() {
        initComponents();
        set1 = new ArrayList<>();
        set2 = new ArrayList<>();
        set3 = new ArrayList<>();
        set4 = new ArrayList<>();
        set5 = new ArrayList<>();
        set6 = new ArrayList<>();
        set7 = new ArrayList<>();
        set8 = new ArrayList<>();
        set9 = new ArrayList<>();
        set10 = new ArrayList<>();
        currentset = set1;
        AddWords();
        pinyinVar = false;
        current = 1;
        PinyinLabel.setVisible(pinyinVar);
        word = 0; //Starts at zero
        correct = 0;
        numWrong = 0;
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        this.setBackground(Color.decode("#E0E0E0"));
        
        
        PlayRound();
    }

    private void AddWords()
    {
        for (int i=0; i<20; i++){
            set1.add(new ArrayList<>());
            set2.add(new ArrayList<>());
            set3.add(new ArrayList<>());
            set4.add(new ArrayList<>());
            set5.add(new ArrayList<>());
            set6.add(new ArrayList<>());
            set7.add(new ArrayList<>());
            set8.add(new ArrayList<>());
            set9.add(new ArrayList<>());
            set10.add(new ArrayList<>());
        }
        set1.get(0).add("我"); set1.get(0).add("wǒ"); set1.get(0).add("I");
        set1.get(1).add("你"); set1.get(1).add("nǐ"); set1.get(1).add("You");
        set1.get(2).add("是"); set1.get(2).add("shì"); set1.get(2).add("To be");
        set1.get(3).add("中文"); set1.get(3).add("zhōng wén"); set1.get(3).add("Chinese");
        set1.get(4).add("很"); set1.get(4).add("hěn"); set1.get(4).add("Very");
        set1.get(5).add("好"); set1.get(5).add("hǎo"); set1.get(5).add("Good");
        set1.get(6).add("学生"); set1.get(6).add("xué shēng"); set1.get(6).add("Student");
        set1.get(7).add("也"); set1.get(7).add("yě"); set1.get(7).add("Also");
        set1.get(8).add("不"); set1.get(8).add("bù"); set1.get(8).add("No");
        set1.get(9).add("老师"); set1.get(9).add("lǎo shī"); set1.get(9).add("Teacher");
        set1.get(10).add("他"); set1.get(10).add("tā"); set1.get(10).add("Him");
        set1.get(11).add("英文"); set1.get(11).add("yīng wén"); set1.get(11).add("English");
        set1.get(12).add("学"); set1.get(12).add("xué"); set1.get(12).add("To study");
        set1.get(13).add("贵"); set1.get(13).add("guì"); set1.get(13).add("Honorable");
        set1.get(14).add("姓名"); set1.get(14).add("xìng míng"); set1.get(14).add("Name");
        set1.get(15).add("叫"); set1.get(15).add("jiào"); set1.get(15).add("To be called");
        set1.get(16).add("什么"); set1.get(16).add("shén me"); set1.get(16).add("What");
        set1.get(17).add("几岁"); set1.get(17).add("jǐ suì"); set1.get(17).add("How old");
        set1.get(18).add("说"); set1.get(18).add("shuō"); set1.get(18).add("To speak");
        set1.get(19).add("谁"); set1.get(19).add("shéi"); set1.get(19).add("Who");
        //set1.get(20).add("X"); set1.get(19).add("X"); set1.get(19).add("X");
        
        set2.get(0).add("请问"); set2.get(0).add("qǐngwèn"); set2.get(0).add("Excuse me");
        set2.get(1).add("和"); set2.get(1).add("hé"); set2.get(1).add("And");
        set2.get(2).add("同学"); set2.get(2).add("tóng xué"); set2.get(2).add("Classmate");
        set2.get(3).add("国"); set2.get(3).add("guó"); set2.get(3).add("Country");
        set2.get(4).add("人"); set2.get(4).add("rén"); set2.get(4).add("People");
        set2.get(5).add("男"); set2.get(5).add("nán"); set2.get(5).add("Male");
        set2.get(6).add("少"); set2.get(6).add("shǎo"); set2.get(6).add("Few");
        set2.get(7).add("家"); set2.get(7).add("jiā"); set2.get(7).add("Home");
        set2.get(8).add("难"); set2.get(8).add("nán"); set2.get(8).add("Challenging");
        set2.get(9).add("女"); set2.get(9).add("nǚ"); set2.get(9).add("Female");
        set2.get(10).add("多"); set2.get(10).add("duō"); set2.get(10).add("Many");
        set2.get(11).add("高兴"); set2.get(11).add("gāo xìng"); set2.get(11).add("Glad");
        set2.get(12).add("邮件"); set2.get(12).add("yóu jiàn"); set2.get(12).add("Mail");
        set2.get(13).add("功课"); set2.get(13).add("gōng kè"); set2.get(13).add("Homework");
        set2.get(14).add("来"); set2.get(14).add("lái"); set2.get(14).add("To come");
        set2.get(15).add("朋友"); set2.get(15).add("péng you"); set2.get(15).add("Friend");
        set2.get(16).add("电子"); set2.get(16).add("diàn zǐ"); set2.get(16).add("Electronic");
        set2.get(17).add("有"); set2.get(17).add("yǒu"); set2.get(17).add("To have");
        set2.get(18).add("容易"); set2.get(18).add("róng yì"); set2.get(18).add("Easy");
        set2.get(19).add("再见"); set2.get(19).add("zài jiàn"); set2.get(19).add("Goodbye");
        
        set3.get(0).add("地址"); set3.get(0).add("dì zhǐ"); set3.get(0).add("Address");
        set3.get(1).add("这"); set3.get(1).add("zhè"); set3.get(1).add("This");
        set3.get(2).add("那"); set3.get(2).add("nà"); set3.get(2).add("That");
        set3.get(3).add("名片"); set3.get(3).add("míng piàn"); set3.get(3).add("Business card");
        set3.get(4).add("忙"); set3.get(4).add("máng"); set3.get(4).add("Busy");
        set3.get(5).add("爸爸"); set3.get(5).add("bà ba"); set3.get(5).add("Father");
        set3.get(6).add("都"); set3.get(6).add("dōu"); set3.get(6).add("All");
        set3.get(7).add("爱"); set3.get(7).add("ài"); set3.get(7).add("To love");
        set3.get(8).add("弟弟"); set3.get(8).add("dì di"); set3.get(8).add("Younger brother");
        set3.get(9).add("书"); set3.get(9).add("shū"); set3.get(9).add("Book");
        set3.get(10).add("妈妈"); set3.get(10).add("mā ma"); set3.get(10).add("Mother");
        set3.get(11).add("孩子"); set3.get(11).add("hái zi"); set3.get(11).add("Child");
        set3.get(12).add("月"); set3.get(12).add("yuè"); set3.get(12).add("Month");
        set3.get(13).add("姐姐"); set3.get(13).add("jiě jiě"); set3.get(13).add("Older sister");
        set3.get(14).add("大"); set3.get(14).add("dà"); set3.get(14).add("Big");
        set3.get(15).add("买"); set3.get(15).add("mǎi"); set3.get(15).add("To buy");
        set3.get(16).add("哥哥"); set3.get(16).add("gē gē"); set3.get(16).add("Older brother");
        set3.get(17).add("父母"); set3.get(17).add("fù mǔ"); set3.get(17).add("Parent");
        set3.get(18).add("卖"); set3.get(18).add("mài"); set3.get(18).add("To sell");
        set3.get(19).add("妹妹"); set3.get(19).add("meì meì"); set3.get(19).add("Younger sister");
        
        set4.get(0).add("叔叔"); set4.get(0).add("shūshu"); set4.get(0).add("Uncle");
        set4.get(1).add("穿"); set4.get(1).add("chuān"); set4.get(1).add("To wear");
        set4.get(2).add("本子"); set4.get(2).add("běn zi"); set4.get(2).add("Notebook");
        set4.get(3).add("笔"); set4.get(3).add("bǐ"); set4.get(3).add("Pen");
        set4.get(4).add("红色"); set4.get(4).add("hóng sè"); set4.get(4).add("Red");
        set4.get(5).add("电脑"); set4.get(5).add("diàn nǎo"); set4.get(5).add("Computer");
        set4.get(6).add("最"); set4.get(6).add("zuì"); set4.get(6).add("Most");
        set4.get(7).add("喜欢"); set4.get(7).add("xǐ huan"); set4.get(7).add("To like");
        set4.get(8).add("绿色"); set4.get(8).add("lǜ sè"); set4.get(8).add("Green");
        set4.get(9).add("菜"); set4.get(9).add("cài"); set4.get(9).add("Dish");
        set4.get(10).add("喝"); set4.get(10).add("hē"); set4.get(10).add("To drink");
        set4.get(11).add("看"); set4.get(11).add("kàn"); set4.get(11).add("To read");
        set4.get(12).add("水"); set4.get(12).add("shuǐ"); set4.get(12).add("Water");
        set4.get(13).add("果"); set4.get(13).add("guǒ"); set4.get(13).add("Fruit");
        set4.get(14).add("白色"); set4.get(14).add("bái sè"); set4.get(14).add("White");
        set4.get(15).add("网"); set4.get(15).add("wǎng"); set4.get(15).add("Internet");
        set4.get(16).add("筷子"); set4.get(16).add("kuài zi"); set4.get(16).add("Chopsticks");
        set4.get(17).add("吃"); set4.get(17).add("chī"); set4.get(17).add("To eat");
        set4.get(18).add("茶"); set4.get(18).add("chá"); set4.get(18).add("Tea");
        set4.get(19).add("灰色"); set4.get(19).add("huīsè"); set4.get(19).add("Grey");
        
        set5.get(0).add("菜单"); set5.get(0).add("cài dān"); set5.get(0).add("Menu");
        set5.get(1).add("回家"); set5.get(1).add("huí jiā"); set5.get(1).add("To go home");
        set5.get(2).add("考试"); set5.get(2).add("kǎo shì"); set5.get(2).add("Exam");
        set5.get(3).add("累"); set5.get(3).add("lèi"); set5.get(3).add("Tired");
        set5.get(4).add("今天"); set5.get(4).add("jīn tiān"); set5.get(4).add("Today");
        set5.get(5).add("睡觉"); set5.get(5).add("shuì jiáo"); set5.get(5).add("To go to sleep");
        set5.get(6).add("晚"); set5.get(6).add("wǎn"); set5.get(6).add("Late");
        set5.get(7).add("就"); set5.get(7).add("jiù"); set5.get(7).add("Then");
        set5.get(8).add("慢"); set5.get(8).add("màn"); set5.get(8).add("Slow");
        set5.get(9).add("起床"); set5.get(9).add("qǐ chuáng"); set5.get(9).add("To get up");
        set5.get(10).add("坏"); set5.get(10).add("huài"); set5.get(10).add("Bad");
        set5.get(11).add("明天"); set5.get(11).add("míng tiān"); set5.get(11).add("Tomorrow");
        set5.get(12).add("快"); set5.get(12).add("kuài"); set5.get(12).add("Fast");
        set5.get(13).add("长"); set5.get(13).add("cháng"); set5.get(13).add("Long");
        set5.get(14).add("听"); set5.get(14).add("tīng"); set5.get(14).add("To listen to");
        set5.get(15).add("高"); set5.get(15).add("gāo"); set5.get(15).add("High");
        set5.get(16).add("便宜"); set5.get(16).add("pián yi"); set5.get(16).add("Inexpensive");
        set5.get(17).add("星期"); set5.get(17).add("xīng qī"); set5.get(17).add("Week");
        set5.get(18).add("矮"); set5.get(18).add("ǎi"); set5.get(18).add("Short");
        set5.get(19).add("胖"); set5.get(19).add("pàng"); set5.get(19).add("Fat");
        
        set6.get(0).add("早上"); set6.get(0).add("zǎo shàng"); set6.get(0).add("Early morning");
        set6.get(1).add("对"); set6.get(1).add("duì"); set6.get(1).add("Correct");
        set6.get(2).add("错"); set6.get(2).add("cuò"); set6.get(2).add("Wrong");
        set6.get(3).add("上午"); set6.get(3).add("shàng wǔ"); set6.get(3).add("Morning");
        set6.get(4).add("深"); set6.get(4).add("shēn"); set6.get(4).add("Dark");
        set6.get(5).add("晚上"); set6.get(5).add("wǎn shàng"); set6.get(5).add("Evening");
        set6.get(6).add("热"); set6.get(6).add("rè"); set6.get(6).add("Hot");
        set6.get(7).add("干净"); set6.get(7).add("gān jìng"); set6.get(7).add("Clean");
        set6.get(8).add("夜里"); set6.get(8).add("yè lǐ"); set6.get(8).add("Night");
        set6.get(9).add("脏"); set6.get(9).add("zāng"); set6.get(9).add("Dirty");
        set6.get(10).add("不到"); set6.get(10).add("bù dào"); set6.get(10).add("Before");
        set6.get(11).add("下午"); set6.get(11).add("xià wǔ"); set6.get(11).add("Afternoon");
        set6.get(12).add("教室"); set6.get(12).add("jiào shì"); set6.get(12).add("Classroom");
        set6.get(13).add("先"); set6.get(13).add("xiān"); set6.get(13).add("First");
        set6.get(14).add("中午"); set6.get(14).add("zhōng wǔ"); set6.get(14).add("Noon");
        set6.get(15).add("晴"); set6.get(15).add("qíng"); set6.get(15).add("Sunny");
        set6.get(16).add("聪明"); set6.get(16).add("cōng ming"); set6.get(16).add("Smart");
        set6.get(17).add("极了"); set6.get(17).add("jí le"); set6.get(17).add("Extremely");
        set6.get(18).add("外"); set6.get(18).add("wài"); set6.get(18).add("Outside");
        set6.get(19).add("半夜"); set6.get(19).add("bàn yè"); set6.get(19).add("Midnight");
        
        set7.get(0).add("力"); set7.get(0).add("lì"); set7.get(0).add("Power");
        set7.get(1).add("糸"); set7.get(1).add("mì"); set7.get(1).add("Fine silk");
        set7.get(2).add("寸"); set7.get(2).add("cùn"); set7.get(2).add("Inch");
        set7.get(3).add("夕"); set7.get(3).add("xī"); set7.get(3).add("Sunset");
        set7.get(4).add("隹"); set7.get(4).add("zhuī"); set7.get(4).add("Short-tailed bird");
        set7.get(5).add("戈"); set7.get(5).add("gē"); set7.get(5).add("Dagger");
        set7.get(6).add("雨"); set7.get(6).add("yǔ"); set7.get(6).add("Rain");
        set7.get(7).add("刀"); set7.get(7).add("dāo"); set7.get(7).add("Knife");
        set7.get(8).add("耳"); set7.get(8).add("ěr"); set7.get(8).add("Ear");
        set7.get(9).add("食"); set7.get(9).add("shí"); set7.get(9).add("To eat");
        set7.get(10).add("贝"); set7.get(10).add("bèi"); set7.get(10).add("Shell");
        set7.get(11).add("木"); set7.get(11).add("mù"); set7.get(11).add("Wood");
        set7.get(12).add("金"); set7.get(12).add("jīn"); set7.get(12).add("Gold");
        set7.get(13).add("示"); set7.get(13).add("shì"); set7.get(13).add("To show");
        set7.get(14).add("工"); set7.get(14).add("gōng"); set7.get(14).add("Work");
        set7.get(15).add("田"); set7.get(15).add("tián"); set7.get(15).add("Field");
        set7.get(16).add("火"); set7.get(16).add("huǒ"); set7.get(16).add("Fire");
        set7.get(17).add("目"); set7.get(17).add("mì"); set7.get(17).add("Eye");
        set7.get(18).add("弓"); set7.get(18).add("gōng"); set7.get(18).add("Bow");
        set7.get(19).add("足"); set7.get(19).add("zú"); set7.get(19).add("Foot");
        
        set8.get(0).add("左右"); set8.get(0).add("zuǒ yòu"); set8.get(0).add("Approximately");
        set8.get(1).add("呆"); set8.get(1).add("dāi"); set8.get(1).add("To stay");
        set8.get(2).add("发现"); set8.get(2).add("fā xiàn"); set8.get(2).add("To find");
        set8.get(3).add("担心"); set8.get(3).add("dān xīn"); set8.get(3).add("To worry");
        set8.get(4).add("然后"); set8.get(4).add("rán hòu"); set8.get(4).add("Then");
        set8.get(5).add("照片"); set8.get(5).add("zhào piàn"); set8.get(5).add("Photograph");
        set8.get(6).add("过"); set8.get(6).add("guò"); set8.get(6).add("To pass");
        set8.get(7).add("主"); set8.get(7).add("zhǔ"); set8.get(7).add("Main");
        set8.get(8).add("无聊"); set8.get(8).add("wú liáo"); set8.get(8).add("Boring");
        set8.get(9).add("群"); set8.get(9).add("qún"); set8.get(9).add("Group");
        set8.get(10).add("广"); set8.get(10).add("guǎng"); set8.get(10).add("Broad");
        set8.get(11).add("轻松"); set8.get(11).add("qīng sōng"); set8.get(11).add("Relaxed");
        set8.get(12).add("违规者"); set8.get(12).add("wéi guī zhě"); set8.get(12).add("Violator");
        set8.get(13).add("送"); set8.get(13).add("sòng"); set8.get(13).add("To escort");
        set8.get(14).add("一样"); set8.get(14).add("yí yàng"); set8.get(14).add("Same");
        set8.get(15).add("偶尔"); set8.get(15).add("偶尔"); set8.get(15).add("Occasionally");
        set8.get(16).add("因为"); set8.get(16).add("yīn wéi"); set8.get(16).add("Because");
        set8.get(17).add("并"); set8.get(17).add("bìng"); set8.get(17).add("And");
        set8.get(18).add("上床"); set8.get(18).add("shàng chuáng"); set8.get(18).add("Get in bed");
        set8.get(19).add("与"); set8.get(19).add("yǔ"); set8.get(19).add("Together");
        
        set9.get(0).add("开车"); set9.get(0).add("kāichē"); set9.get(0).add("To drive a car");
        set9.get(1).add("大约"); set9.get(1).add("dà yuē"); set9.get(1).add("About");
        set9.get(2).add("开学"); set9.get(2).add("kāi xué"); set9.get(2).add("Back to school");
        set9.get(3).add("小气"); set9.get(3).add("xiǎo qi"); set9.get(3).add("Stingy");
        set9.get(4).add("笨"); set9.get(4).add("bèn"); set9.get(4).add("Clumsy");
        set9.get(5).add("才"); set9.get(5).add("cái"); set9.get(5).add("Not until");
        set9.get(6).add("前"); set9.get(6).add("qián"); set9.get(6).add("Before");
        set9.get(7).add("刻"); set9.get(7).add("kè"); set9.get(7).add("Quarter");
        set9.get(8).add("有空"); set9.get(8).add("yǒu kōng"); set9.get(8).add("To be available");
        set9.get(9).add("后"); set9.get(9).add("hòu"); set9.get(9).add("After");
        set9.get(10).add("体育"); set9.get(10).add("tǐ yù"); set9.get(10).add("PE");
        set9.get(11).add("叉子"); set9.get(11).add("chā zi"); set9.get(11).add("Fork");
        set9.get(12).add("分钟"); set9.get(12).add("fēn zhōng"); set9.get(12).add("Minute");
        set9.get(13).add("碗"); set9.get(13).add("wǎn"); set9.get(13).add("Bowl");
        set9.get(14).add("半"); set9.get(14).add("bàn"); set9.get(14).add("Half");
        set9.get(15).add("杯"); set9.get(15).add("bēi"); set9.get(15).add("Cup");
        set9.get(16).add("蛋"); set9.get(16).add("dàn"); set9.get(16).add("Egg");
        set9.get(17).add("秒钟"); set9.get(17).add("miǎo zhōng"); set9.get(17).add("Second");
        set9.get(18).add("勺子"); set9.get(18).add("sháo zi"); set9.get(18).add("Spoon");
        set9.get(19).add("科学"); set9.get(19).add("kē xué"); set9.get(19).add("Science");
        
        set10.get(0).add("馄饨"); set10.get(0).add("hún tún"); set10.get(0).add("Wonton");
        set10.get(1).add("汁"); set10.get(1).add("zhī"); set10.get(1).add("Juice");
        set10.get(2).add("盘"); set10.get(2).add("pán"); set10.get(2).add("Plate");
        set10.get(3).add("类"); set10.get(3).add("lèi"); set10.get(3).add("Category");
        set10.get(4).add("辣"); set10.get(4).add("là"); set10.get(4).add("Spicy");
        set10.get(5).add("买单"); set10.get(5).add("mǎi dān"); set10.get(5).add("To pay");
        set10.get(6).add("豆腐"); set10.get(6).add("dòu fu"); set10.get(6).add("Tofu");
        set10.get(7).add("比较"); set10.get(7).add("bǐ jiào"); set10.get(7).add("Relatively");
        set10.get(8).add("用"); set10.get(8).add("yòng"); set10.get(8).add("To use");
        set10.get(9).add("舒服"); set10.get(9).add("shū fu"); set10.get(9).add("Comfortable");
        set10.get(10).add("汤"); set10.get(10).add("tāng"); set10.get(10).add("Soup");
        set10.get(11).add("一共"); set10.get(11).add("yí gòng"); set10.get(11).add("Altogether");
        set10.get(12).add("小吃"); set10.get(12).add("xiǎo chī"); set10.get(12).add("Snack");
        set10.get(13).add("尺子"); set10.get(13).add("chǐ zi"); set10.get(13).add("Ruler");
        set10.get(14).add("银"); set10.get(14).add("yín"); set10.get(14).add("Silver");
        set10.get(15).add("书包"); set10.get(15).add("shū bāo"); set10.get(15).add("School bag");
        set10.get(16).add("凉菜"); set10.get(16).add("liáng cài"); set10.get(16).add("Appetizer");
        set10.get(17).add("折扣"); set10.get(17).add("zhé kòu"); set10.get(17).add("Discount");
        set10.get(18).add("认为"); set10.get(18).add("juédé"); set10.get(18).add("To feel");
        set10.get(19).add("蔬菜"); set10.get(19).add("shū cài"); set10.get(19).add("Vegetable");
    }
    
    private void PlayRound(){
        MockPaint();
        //for (ArrayList<String> set11 : set1) {
            //ChineseLabel.setText(set11.get(0));
            //PinyinLabel.setText(set11.get(1));
        //}
    }
    
    private void Reset(){
        word = 0;
        correct = 0;
        numWrong=0;
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        MockPaint();
    }
    
    private void MockPaint(){
        if (word<20){
            pinyin = currentset.get(word).get(1);
            ChineseLabel.setText(currentset.get(word).get(0));
            PinyinLabel.setText(pinyin);
        }
        jLabel6.setText("Correct: "+correct+"/" +(word));
        jLabel5.setText("Progress: "+(word)+"/20");
        jTextField1.setText("");
        //System.out.println(jProgressBar1.getMaximum());
        jProgressBar1.setValue(100-25*numWrong);
        jLabel4.setText("Health: "+(100-25*numWrong)+"%");
        jLabel2.setText("Current Level: "+current);
        if (100-25*numWrong==0){
            jLabel8.setText("You lose, reset to try again");
            jTextField1.setEnabled(false);
            jButton12.setEnabled(false);
        }
        else{
            jTextField1.setEnabled(true);
            jButton12.setEnabled(true);
        }
        if (c1==true) jButton1.setBackground(Color.GREEN);
        if (c2==true) jButton2.setBackground(Color.GREEN);
        if (c3==true) jButton3.setBackground(Color.GREEN);
        if (c4==true) jButton4.setBackground(Color.GREEN);
        if (c5==true) jButton5.setBackground(Color.GREEN);
        if (c6==true) jButton6.setBackground(Color.GREEN);
        if (c7==true) jButton7.setBackground(Color.GREEN);
        if (c8==true) jButton8.setBackground(Color.GREEN);
        if (c9==true) jButton9.setBackground(Color.GREEN);
        if (c10==true) jButton10.setBackground(Color.GREEN);
        if (word==20){
            jTextField1.setEnabled(false);
            jButton12.setEnabled(false);
        }
        else if (100-25*numWrong>0){
            jTextField1.setEnabled(true);
            jButton12.setEnabled(true);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ChineseLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        PinyinLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(100, 32767));

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton10.setText("10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Level");

        ChineseLabel.setFont(new java.awt.Font("Monospaced", 1, 200)); // NOI18N
        ChineseLabel.setText("中文");

        jTextField1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Enter English:");

        jButton11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jProgressBar1.setOrientation(1);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("Health: 100%");

        jRadioButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jRadioButton1.setText("Show Pinyin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        PinyinLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        PinyinLabel.setText("Health");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setText("Progress: 0/20");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Current Level: 1");

        jButton12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton12.setText("Check");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Correct: 0/0");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 200, 33));
        jLabel7.setText("Correct");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Incorrect");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(1, 1, 1));
        jLabel9.setText("Correct Answer: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(442, 442, 442)
                .addComponent(jRadioButton1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChineseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(PinyinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(605, 605, 605)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(jLabel9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addComponent(jButton11))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(20, 20, 20)
                        .addComponent(jButton2)
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addGap(20, 20, 20)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20)
                        .addComponent(jButton5)
                        .addGap(20, 20, 20)
                        .addComponent(jButton6)
                        .addGap(20, 20, 20)
                        .addComponent(jButton7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ChineseLabel)
                        .addGap(6, 6, 6)
                        .addComponent(PinyinLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)))))
                .addGap(20, 20, 20)
                .addComponent(jButton8)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton12)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7)))))
                .addGap(5, 5, 5)
                .addComponent(jLabel9))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        current = 1;
        currentset = set1;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        current = 2;
        currentset = set2;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        current = 3;
        currentset = set3;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        current = 4;
        currentset = set4;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        current = 5;
        currentset = set5;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        current = 6;
        currentset = set6;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        current = 7;
        currentset = set7;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        current = 8;
        currentset = set8;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        current = 9;
        currentset = set9;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        current = 10;
        currentset = set10;
        Reset();
        PlayRound();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        //checks it
        //System.out.println(currentset.get(word).get(2)+"    "+jTextField1.getText());
        jLabel9.setText("Correct answer: "+currentset.get(word).get(2));
        if (currentset.get(word).get(2).toLowerCase().equals(jTextField1.getText().toLowerCase())){
            correct ++;
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
        }
        else{
            jLabel7.setVisible(false);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            numWrong++;
        }
        if (word==19){
            if (current==1) c1=true;
            if (current==2) c2=true;
            if (current==3) c3=true;
            if (current==4) c4=true;
            if (current==5) c5=true;
            if (current==6) c6=true;
            if (current==7) c7=true;
            if (current==8) c8=true;
            if (current==9) c9=true;
            if (current==10) c10=true;
        }
        word ++;
        MockPaint();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //checks it
        //System.out.println(currentset.get(word).get(2)+"    "+jTextField1.getText());
        jLabel9.setText("Correct answer: "+currentset.get(word).get(2));
        if (currentset.get(word).get(2).toLowerCase().equals(jTextField1.getText().toLowerCase())){
            correct ++;
            jLabel7.setVisible(true);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
        }
        else{
            jLabel7.setVisible(false);
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            numWrong++;
        }
        if (word==19){
            if (current==1) c1=true;
            if (current==2) c2=true;
            if (current==3) c3=true;
            if (current==4) c4=true;
            if (current==5) c5=true;
            if (current==6) c6=true;
            if (current==7) c7=true;
            if (current==8) c8=true;
            if (current==9) c9=true;
            if (current==10) c10=true;
        }
        word ++;
        MockPaint();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        pinyinVar =!(pinyinVar);
//        if (pinyinVar==true){
//            PinyinLabel.setText(pinyin);
//        }
//        else PinyinLabel.setText("");
        PinyinLabel.setVisible(pinyinVar);
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChineseLabel;
    private javax.swing.JLabel PinyinLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
