package fatty.view;

import fatty.controller.MouseListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 * Created by Xnn on 2020/2/13 20:00
 */
public class Panel extends JPanel {
    
    private JTextField filePath = new JTextField(20);
    // 聚合名输入框
    private JLabel aggregationLabel = new JLabel("聚合名：");
    private JTextField aggregationName = new JTextField(12);
    // 渠道名输入框
    private JLabel channelLabel = new JLabel("渠道名：");
    private JTextField channelName = new JTextField(12);
    // 是否换名 选择按钮
    private JLabel isChangeNameLabel = new JLabel("是否换名：");
    private ButtonGroup isChangeName = new ButtonGroup();
    private JRadioButton no = new JRadioButton("否");
    private JRadioButton yes = new JRadioButton("是");
    
    // 原游戏名输入框
    private JLabel odlGameLabel = new JLabel("原游戏名：");
    private JTextField odlGameName = new JTextField(12);
    
    // 分隔符
    private JLabel delimiter = new JLabel("*****************************************");
    
    // 游戏名输入框
    private JLabel gameLabel = new JLabel("游戏名：");
    private JTextField gameName = new JTextField(12);
    
    // 聚合游戏参数
    private JLabel aggParamLabel = new JLabel("聚合游戏参数：");
    private JTextArea aggParam = new JTextArea();
    
    // 渠道号
    private JLabel channelNoLabel = new JLabel("渠道号：");
    private JTextField channelNo = new JTextField(12);
    
    // 渠道游戏参数
    private JLabel channelParamLabel = new JLabel("渠道游戏参数：");
    private JTextArea channelParam = new JTextArea(5,20);
    
    // 版本号
    private JLabel versionLabel = new JLabel("版本号：");
    private JTextField versionNo = new JTextField(12);
    
    // 包名后缀
    private JLabel suffixLabel = new JLabel("包名后缀：");
    private JTextField suffix = new JTextField(12);
    
    // 备注
    private JLabel remarkLabel = new JLabel("备注：");
    private JTextArea remark = new JTextArea();
    
    // 紧急程度
    private JLabel levelLabel = new JLabel("紧急程度：");
    private JComboBox<String> levelBox = new JComboBox<String>(new String[]{"正常", "加急"});
    
    // 提交按钮
    private JButton submitButton = new JButton("生成TXT文件");
    
    // 界面统一的字体大小
    private Font font = new Font(null, Font.PLAIN, 18);
    
    public Panel() {
        this.setPreferredSize(new Dimension(800, 900));
        this.setLayout(null);
        // this.setBackground(Color.PINK);
        
        // 聚合名输入布局
        this.aggregationLabel.setBounds(30,10,100,30);
        this.aggregationLabel.setFont(font);
        this.add(this.aggregationLabel);
        this.aggregationName.setBounds(140,10,400,30);
        this.aggregationName.setFont(font);
        this.add(this.aggregationName);
        
        // 渠道名输入布局
        this.channelLabel.setBounds(30,50,100,30);
        this.channelLabel.setFont(font);
        this.add(this.channelLabel);
        this.channelName.setBounds(140,50,400,30);
        this.channelName.setFont(font);
        this.add(this.channelName);
        
        // 是否换名布局
        this.isChangeNameLabel.setBounds(30,90,100,30);
        this.isChangeNameLabel.setFont(font);
        this.add(this.isChangeNameLabel);
        this.isChangeName.add(no);
        this.isChangeName.add(yes);
        this.no.setSelected(true);
        this.no.setBounds(140,90,40,30);
        this.add(no);
        this.yes.setBounds(180,90,40,30);
        this.add(yes);
    
        // 原游戏名输入布局
        this.odlGameLabel.setBounds(250,90,100,30);
        this.odlGameLabel.setFont(font);
        this.add(this.odlGameLabel);
        this.odlGameName.setBounds(350,90,300,30);
        this.odlGameName.setFont(font);
        this.add(this.odlGameName);
        
        // 分隔
        this.delimiter.setBounds(20,110,300,30);
        this.add(delimiter);
    
    
        // 游戏名输入布局
        this.gameLabel.setBounds(30,150,100,30);
        this.gameLabel.setFont(font);
        this.add(this.gameLabel);
        this.gameName.setBounds(140,150,400,30);
        this.gameName.setFont(font);
        this.add(this.gameName);
    
        // 聚合游戏参数
        this.aggParamLabel.setBounds(30,190,130,30);
        this.aggParamLabel.setFont(font);
        this.add(this.aggParamLabel);
        this.aggParam.setBounds(170,190,400,150);
        this.aggParam.setFont(font);
        this.add(this.aggParam);
    
        // 渠道号
        this.channelNoLabel.setBounds(30,350,100,30);
        this.channelNoLabel.setFont(font);
        this.add(this.channelNoLabel);
        this.channelNo.setBounds(140,350,400,30);
        this.channelNo.setFont(font);
        this.add(this.channelNo);
    
        // 渠道游戏参数
        this.channelParamLabel.setBounds(30,390,130,30);
        this.channelParamLabel.setFont(font);
        this.add(this.channelParamLabel);
        this.channelParam.setBounds(170,390,400,150);
        this.channelParam.setFont(font);
        this.add(this.channelParam);
    
        // 版本号
        this.versionLabel.setBounds(30,550,100,30);
        this.versionLabel.setFont(font);
        this.add(this.versionLabel);
        this.versionNo.setBounds(140,550,400,30);
        this.versionNo.setFont(font);
        this.add(this.versionNo);
    
        // 包名后缀输入布局
        this.suffixLabel.setBounds(30,590,100,30);
        this.suffixLabel.setFont(font);
        this.add(this.suffixLabel);
        this.suffix.setBounds(140,590,400,30);
        this.suffix.setFont(font);
        this.add(this.suffix);
    
        // 备注输入布局
        this.remarkLabel.setBounds(30,630,100,30);
        this.remarkLabel.setFont(font);
        this.add(this.remarkLabel);
        this.remark.setBounds(140,630,400,100);
        this.remark.setFont(font);
        this.add(this.remark);
    
        // 备注输入布局
        this.levelLabel.setBounds(30,740,100,30);
        this.levelLabel.setFont(font);
        this.add(this.levelLabel);
        this.levelBox.setBounds(140,740,100,30);
        this.levelBox.setFont(font);
        this.add(this.levelBox);
    
        // 生成按钮
        this.submitButton.setBounds(300,820,200,40);
        this.submitButton.setFont(font);
        this.add(this.submitButton);
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击按钮,获取填写参数");
                System.out.println("聚合名:"+aggregationName.getText());
                System.out.println("渠道名:"+channelName.getText());
                System.out.println("是否换名:"+yes.isSelected());
                System.out.println("原游戏名:"+odlGameName.getText());
                System.out.println("游戏名:"+gameName.getText());
                System.out.println("聚合游戏参数:"+aggParam.getText());
                System.out.println("游戏名:"+channelNo.getText());
                System.out.println("渠道号:"+channelParam.getText());
                System.out.println("版本号:"+versionNo.getText());
                System.out.println("包名后缀:"+suffix.getText());
                System.out.println("备注:"+remark.getText());
                System.out.println("紧急程度:"+levelBox.getSelectedItem());
            }
        });
    }
    
    public JTextField getFilePath() {
        return this.filePath;
    }
    
    public void setFilePath(JTextField filePath) {
        this.filePath = filePath;
    }
    
}
