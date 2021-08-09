import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class INGCollege implements ActionListener
{
    private JFrame f;
    private JPanel p1,p2;
    private JLabel Title1, Title2, JCourseID, JCourseName, JDuration, JLevel, JCredit, JNumberOfAssessments, JCourseID2, JLecturerName, JCourseLeader,JStartingDate, JCompletionDate, JCourseID1, JCourseName1, JDuration1, JPrerequisite, JCourseID3, JInstructorName, JCourseLeader1, JStartingDate1, JCompletionDate1, JExamDate, JCourseID4;
    private JTextField JCourseID_, JCourseName_, JDuration_, JCourseID2_, JLecturerName_, JCourseLeader_, JLevel_, JCredit_, JStartingDate_, JCompletionDate_, JNumberOfAssessments_, JCourseID1_, JCourseName1_, JDuration1_, JPrerequisite_, JCourseID3_, JInstructorName_, JCourseLeader1_, JStartingDate1_, JCompletionDate1_, JExamDate_, JCourseID4_;
    private JButton Add, Register, Display, Clear, NextPage, Add1, Register1, Display1, Clear1, Remove,PreviousPage;

    private ArrayList<Course>AL = new ArrayList<Course>();
    private AcademicCourse AC;
    private NonAcademicCourse NAC;

    public INGCollege()
    {
        f = new JFrame("Course Registration");
        p1 = new JPanel();
        p2 = new JPanel();

        Title1 = new JLabel("Academic Course");
        JCourseID = new JLabel("Course ID : ");
        JCourseName = new JLabel("Course Name : ");
        JDuration = new JLabel("Duration : ");
        JLevel = new JLabel("Level : ");
        JCredit = new JLabel("Credit : ");
        JNumberOfAssessments = new JLabel("Number of Assessments :");

        Title2 = new JLabel("Non-Academic Course");
        JCourseID1 = new JLabel("Course ID : ");
        JCourseName1 = new JLabel("Course Name : ");
        JDuration1 = new JLabel("Duration : ");
        JPrerequisite = new JLabel("Prerequisite : ");

        JCourseID2 = new JLabel("Course ID : ");
        JLecturerName = new JLabel("Lecturer Name : ");
        JCourseLeader = new JLabel("Course Leader : ");
        JStartingDate = new JLabel("Starting Date : ");
        JCompletionDate = new JLabel("Completion Date : ");

        JCourseID3 = new JLabel("Course ID : ");
        JInstructorName = new JLabel("Instructor Name : ");
        JCourseLeader1 = new JLabel("Course Leader : ");
        JStartingDate1 = new JLabel("Starting Date : ");
        JCompletionDate1 = new JLabel("Completion Date : ");
        JExamDate = new JLabel("Exam Date : ");
        
        JCourseID4 = new JLabel("Course ID : ");
        
        JCourseID_ = new JTextField();
        JCourseName_ = new JTextField();
        JDuration_ = new JTextField();
        JLevel_ = new JTextField();
        JCredit_ = new JTextField();

        JCourseID1_ = new JTextField();
        JCourseName1_ = new JTextField();
        JDuration1_ = new JTextField();
        JPrerequisite_ = new JTextField();
        JNumberOfAssessments_ = new JTextField();

        JCourseID2_ = new JTextField();
        JLecturerName_ = new JTextField();
        JCourseLeader_ = new JTextField();
        JStartingDate_ = new JTextField();
        JCompletionDate_ = new JTextField();

        JCourseID3_ = new JTextField();
        JInstructorName_ = new JTextField();
        JCourseLeader1_ = new JTextField();
        JStartingDate1_ = new JTextField();
        JCompletionDate1_ = new JTextField();
        JExamDate_ = new JTextField();
        
        JCourseID4_ = new JTextField();

        f.setVisible(true);
        p1.setVisible(true);
        p2.setVisible(false);

        f.setLayout(null);
        p1.setLayout(null);
        p2.setLayout(null);

        f.setSize(860,640);
        p1.setSize(860,640);
        p2.setSize(860,640);

        Add = new JButton("Add");
        Register = new JButton("Register");
        Display = new JButton("Display");
        Clear = new JButton("Clear");
        NextPage = new JButton("Next Page");

        Add1 = new JButton("Add");
        Register1 = new JButton("Register");
        Display1 = new JButton("Display");
        Clear1 = new JButton("Clear");
        Remove = new JButton("Remove");
        PreviousPage = new JButton("Previous Page");

        Title1.setFont(new Font("Arial",Font.BOLD,25));
        Title2.setFont(new Font("Arial",Font.BOLD,25));

        Title1.setBounds(300,20,400,50);
        JCourseID.setBounds(40,100,120,25);
        JCourseName.setBounds(430,100,120,25);
        JDuration.setBounds(40,150,120,25);
        JLevel.setBounds(430,150,120,25);
        JCredit.setBounds(40,200,120,25);
        JNumberOfAssessments.setBounds(430,200,150,25);

        Title2.setBounds(300,20,400,50);
        JCourseID1.setBounds(40,100,120,25);
        JCourseName1.setBounds(430,100,120,25);
        JDuration1.setBounds(40,150,120,25);
        JPrerequisite.setBounds(430,150,120,25);

        JCourseID2.setBounds(40,310,120,25);
        JLecturerName.setBounds(430,310,120,25);
        JCourseLeader.setBounds(40,360,120,25); 
        JStartingDate.setBounds(430,360,120,25);
        JCompletionDate.setBounds(40,410,120,25);

        JCourseID3.setBounds(40,260,120,25);
        JInstructorName.setBounds(430,260,120,25);
        JCourseLeader1.setBounds(40,310,120,25);
        JStartingDate1.setBounds(430,310,120,25);
        JCompletionDate1.setBounds(40,360,120,25);
        JExamDate.setBounds(430,360,120,25);
        
        JCourseID4.setBounds(40,460,120,25);

        JCourseID_.setBounds(160,100,180,25);
        JCourseName_.setBounds(585,100,180,25);
        JDuration_.setBounds(160,150,180,25);
        JLevel_.setBounds(585,150,180,25);
        JCredit_.setBounds(160,200,180,25);
        JNumberOfAssessments_.setBounds(585,200,180,25);

        JCourseID1_.setBounds(160,100,180,25);
        JCourseName1_.setBounds(585,100,180,25);
        JDuration1_.setBounds(160,150,180,25);
        JPrerequisite_.setBounds(585,150,180,25);

        JCourseID2_.setBounds(160,310,180,25);
        JLecturerName_.setBounds(585,310,180,25);
        JCourseLeader_.setBounds(160,360,180,25);
        JStartingDate_.setBounds(585,360,180,25);
        JCompletionDate_.setBounds(160,410,180,25);

        JCourseID3_.setBounds(160,260,180,25);
        JInstructorName_.setBounds(585,260,180,25);
        JCourseLeader1_.setBounds(160,310,180,25);
        JStartingDate1_.setBounds(585,310,180,25);
        JCompletionDate1_.setBounds(160,360,180,25);
        JExamDate_.setBounds(585,360,180,25);
        
        JCourseID4_.setBounds(160,460,180,25);

        Add.setBounds(585,250,120,25);
        Register.setBounds(585,460,120,25);
        Display.setBounds(220,510,120,25);
        Clear.setBounds(380,510,120,25);
        NextPage.setBounds(540,510,120,25);

        Add1.setBounds(585,200,120,25);
        Register1.setBounds(585,410,120,25);
        Remove.setBounds(160,510,120,25);
        Display1.setBounds(220,560,120,25);
        Clear1.setBounds(380,560,120,25);
        PreviousPage.setBounds(540,560,120,25);

        p1.add(Title1);
        p1.add(JCourseID);
        p1.add(JCourseName);
        p1.add(JDuration);
        p1.add(JCourseID_);
        p1.add(JCourseName_);
        p1.add(JDuration_);
        p1.add(Add);
        p1.add(JCourseID2);
        p1.add(JLecturerName);
        p1.add(JCourseLeader);
        p1.add(JLevel);
        p1.add(JCredit);
        p1.add(JStartingDate);
        p1.add(JCompletionDate);
        p1.add(JNumberOfAssessments);
        p1.add(JCourseID2_);
        p1.add(JLecturerName_);
        p1.add(JCourseLeader_);
        p1.add(JLevel_);
        p1.add(JCredit_);
        p1.add(JStartingDate_);
        p1.add(JCompletionDate_);
        p1.add(JNumberOfAssessments_);
        p1.add(Register);
        p1.add(Display);
        p1.add(Clear);
        p1.add(NextPage);

        p2.add(Title2);
        p2.add(JCourseID1);
        p2.add(JCourseName1);
        p2.add(JDuration1);
        p2.add(JCourseID1_);
        p2.add(JCourseName1_);
        p2.add(JDuration1_);
        p2.add(Add1);
        p2.add(JCourseID3);
        p2.add(JInstructorName);
        p2.add(JCourseLeader1);
        p2.add(JStartingDate1);
        p2.add(JCompletionDate1);
        p2.add(JExamDate);
        p2.add(JPrerequisite);
        p2.add(JCourseID4);
        p2.add(JCourseID3_);
        p2.add(JInstructorName_);
        p2.add(JCourseLeader1_);
        p2.add(JStartingDate1_);
        p2.add(JCompletionDate1_);
        p2.add(JExamDate_);
        p2.add(JPrerequisite_);
        p2.add(JCourseID4_);
        p2.add(Register1);
        p2.add(Display1);
        p2.add(Remove);
        p2.add(Clear1);
        p2.add(PreviousPage);

        f.add(p1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Add.addActionListener(this);
        Add1.addActionListener(this);
        Register.addActionListener(this);
        Register1.addActionListener(this);
        Display.addActionListener(this);
        Display1.addActionListener(this);
        Remove.addActionListener(this);
        Clear.addActionListener(this);
        Clear1.addActionListener(this);
        NextPage.addActionListener(this);
        PreviousPage.addActionListener(this);
    }

    public void actionPerformed(ActionEvent A)
    {
        if(A.getSource()==Add)
        {
            String CourseID="";
            String CourseName="";
            int Duration = 0;
            String Level = "";
            String Credit = "";
            int NumberOfAssessments = 0;            
            try
            {
                CourseID = JCourseID_.getText();
                CourseName = JCourseName_.getText();
                Duration = Integer.parseInt(JDuration_.getText());
                Level = JLevel_.getText();
                Credit = JCredit_.getText();
                NumberOfAssessments = Integer.parseInt(JNumberOfAssessments_.getText());
                boolean SameAC = false;
                for(Course C:AL)
                {
                    if (C.getCourseID().equals(CourseID))
                    {
                        SameAC = true;          
                    }
                }   
                if(SameAC==false)
                {
                    AC = new AcademicCourse(CourseID,CourseName,Duration,Level,Credit,NumberOfAssessments);
                    AL.add(AC);
                    JOptionPane.showMessageDialog(f,"The Academic Course has been added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"The Academic Course has already been added.");
                }
            }
        
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the form properly !");
            }
        }
        else if (A.getSource()==Add1)
        {            
            String CourseID = "";
            String CourseName = "";
            int Duration=0;
            String Prerequisite = "";
            try
            {
                CourseID = JCourseID1_.getText();
                CourseName = JCourseName1_.getText();
                Duration = Integer.parseInt(JDuration1_.getText());
                Prerequisite = JPrerequisite_.getText();  
                boolean SameNAC = false;
                for(Course C:AL)
                {
                    if(C.getCourseID().equals(CourseID))
                    {
                        SameNAC = true;    
                    }
                }
                if(SameNAC == false)
                {
                    NAC = new NonAcademicCourse(CourseID, CourseName, Duration, Prerequisite);
                    AL.add(NAC);
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course is added.");
                }
                else
                {
                    JOptionPane.showMessageDialog(f,"The Non-Academic Course has already been added");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !");
            }
        }

        else if (A.getSource()==Register)
        {
            String CourseID = "";
            String CourseLeader = "";
            String LecturerName = "";
            String StartingDate = "";
            String CompletionDate = "";
            try
            {
                CourseID = JCourseID2_.getText();
                CourseLeader = JCourseID2_.getText();
                LecturerName = JLecturerName_.getText();
                StartingDate = JStartingDate_.getText();
                CompletionDate = JCompletionDate_.getText();
                boolean SameAC1 = false;
                for(Course CO:AL)
                {
                    if(CO.getCourseID().equals(CourseID))
                    {
                        SameAC1 = true;
                        if (CO instanceof AcademicCourse)
                        {
                            AC = (AcademicCourse) CO;
                            if (AC.getisRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(f,"Academic Course has already been registered.");
                            }
                            else
                            {
                                AC.Register(CourseLeader, LecturerName, StartingDate, CompletionDate);
                                JOptionPane.showMessageDialog(f,"The academic course has been registered.");                                
                            }
                        }
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(f,"The CourseID do not match.");
                       break;
                    }
                }
            }

            catch (Exception E)
            {
                JOptionPane.showMessageDialog(p1,"Please fill up the forms properly !");
            }
        }

        else if (A.getSource()==Register1)
        {
            String CourseID = "";
            String CourseLeader = "";
            String InstructorName = "";
            String StartingDate = "";
            String CompletionDate = "";
            String ExamDate = "";
            try
            {
                CourseID = JCourseID3_.getText();
                CourseLeader = JCourseLeader_.getText();
                InstructorName = JLecturerName_.getText();
                StartingDate = JStartingDate_.getText();
                CompletionDate = JCompletionDate_.getText();
                ExamDate = JExamDate_.getText();
                boolean SameNAC1 = false;
                for(Course CO:AL)
                {
                    if(CO.getCourseID().equals(CourseID))
                    {
                        SameNAC1 = true;
                        if (CO instanceof NonAcademicCourse)
                        {
                            NAC = (NonAcademicCourse)CO;
                            if (NAC.getisRegistered()==true)
                            {
                                JOptionPane.showMessageDialog(f,"Non-Academic Course has already been registered.");
                            }
                            else
                            {
                                NAC.Register(CourseLeader, InstructorName, StartingDate, CompletionDate, ExamDate);
                                JOptionPane.showMessageDialog(f,"The non-academic course has been registered.");   
                            }
                        }
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(f,"The CourseID do not match.");
                        break;
                    }    
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !");
            }
        }
        else if (A.getSource()==Remove)
        {
            String CourseID = JCourseID4_.getText();
            try{
                for(Course C:AL){
                    if(C.getCourseID().equals(CourseID))
                    {
                        if(C instanceof NonAcademicCourse)
                        {
                            NAC=(NonAcademicCourse)C;
                            if(NAC.getisRemoved()==false)
                            {
                                NAC.Remove();
                                JOptionPane.showMessageDialog(f,"The Course has been removed.");
                                
                            }
                            else if(NAC.getisRemoved()==true)
                            {
                                JOptionPane.showMessageDialog(f,"The Course has been already removed.");
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f,"Enter valid CourseID");
                        break;
                    }
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(f,"Please fill up the form properly !");
            }
        }
        else if (A.getSource()==Display)
        {
            for(Course CO:AL)
            {
                if(CO instanceof AcademicCourse)
                {
                    AcademicCourse AC = (AcademicCourse)CO;

                    AC.Display();
                }
            }                         
        }
        else if (A.getSource()==Display1)
        {
            for(Course CO:AL)
            {
                if(CO instanceof NonAcademicCourse)
                {
                    NonAcademicCourse NAC = (NonAcademicCourse)CO;

                    NAC.Display();
                }
            }
        }

        else if (A.getSource()==Clear)
        {
            JCourseID_.setText("");
            JCourseName_.setText("");
            JDuration_.setText("");
            JLecturerName_.setText("");
            JCourseLeader_.setText("");
            JLevel_.setText("");
            JCredit_.setText("");
            JStartingDate_.setText("");
            JCompletionDate_.setText("");
            JNumberOfAssessments_.setText("");
            JCourseID2_.setText("");
        }
        else if (A.getSource()==Clear1)
        {
            JCourseID1_.setText("");
            JCourseName1_.setText("");
            JDuration1_.setText("");
            JInstructorName_.setText("");
            JCourseLeader1_.setText("");
            JStartingDate1_.setText("");
            JCompletionDate1_.setText("");
            JExamDate_.setText("");
            JPrerequisite_.setText("");
            JCourseID3_.setText("");
            JCourseID4_.setText("");
        }
        else if(A.getSource()==NextPage)
        {
            p1.setVisible(false);
            p2.setVisible(true);
            f.add(p2);
        } 
        else if(A.getSource()==PreviousPage)
        {
            p2.setVisible(false);
            p1.setVisible(true);
        }
    }

    public static void main(String[]args)
    {
        new INGCollege();
    }
}
