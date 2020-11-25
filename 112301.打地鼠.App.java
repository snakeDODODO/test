//导入pac包
package pac;
//导入javax.swing的通配包
import javax.swing.*;
//导入java图形界面通配包
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
//导入java鼠标事件适配器包
import java.awt.event.MouseAdapter;
//导入java鼠标事件包
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;
//新建类
public class App {
//    定义一个公用新JLabel对象，名为label_img
    private JLabel label_img = new JLabel();
//    定义一个公用新JLabel对象，名为myPanel
    private JPanel myPanel = new JPanel();
//    定义一个公用新JLabel对象，名为mlabel_background
    private JLabel label_background = new JLabel();
//    定义一个公用新JLabel对象，名为label_score
    private JLabel label_score = new JLabel();
//    定义一个初始计数值i，类型为int，值为0
    int i = 0;

    //新建类,类名为App
    public App() {
//        为label_img添加鼠标监听事件
        label_img.addMouseListener(new MouseAdapter() {
            //            声明方法重写
            @Override
//            重写mouseClicked方法
            public void mouseClicked(MouseEvent e) {
//                调用父类mouseClicked方法
                super.mouseClicked(e);
//                初始值自+1
                i++;
//                设置得分提示的文本内容
                label_score.setText("你的得分:" + String.valueOf(i));
//                设置地鼠图片的出现指标和长宽
                label_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),100,100);
            }
        });
    }

    void go() throws MalformedURLException {
//        新建URL对象寻找同级目录下的文件路径，命名为imgURL1
        URL imgURL1 = App.class.getResource("timg.gif");
//        设置地鼠图片
        label_img.setIcon(new ImageIcon(imgURL1));
//        设置地鼠图片初始位置和长宽
        label_img.setBounds(100,100,100,100);
        //        新建URL对象寻找同级目录下的文件路径，命名为imgURL2
        URL imgURL2 = App.class.getResource("timg5.jpg");
//        设置程序背景图片
        label_background.setIcon(new ImageIcon(imgURL2));
//        设置程序背景图片的初始位置和长宽
        label_background.setBounds(0,0,720,600);
//        设置提示框的文字颜色
        label_score.setForeground(Color.blue);
//        设置提示框的内容
        label_score.setText("你的得分：0");
//        设置提示框初始位置和长宽
        label_score.setBounds(0,0,100,100);

//        将地鼠图片添加到程序主体中
        myPanel.add(label_img);
//        将提示框添加到程序主体中
        myPanel.add(label_score);
//        将背景图片添加到程序主体中
        myPanel.add(label_background);
//        设置程序布管理器为空
        myPanel.setLayout(null);

//        新建JFrame对象app，名为frame
        JFrame frame = new JFrame("App");
//        设置frame的容器内容
        frame.setContentPane(myPanel);
//        设置组件的窗口大小以及初始出现位置
        frame.setBounds(100,100,720,600);
//        设置frame的默认关闭操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        将图形界面设置为可见
        frame.setVisible(true);
    }
//    创建主方法
    public static void main(String[] args) throws MalformedURLException {
//        匿名类调用go方法
        new App().go();
    }
}
