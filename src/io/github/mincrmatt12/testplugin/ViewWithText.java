package io.github.mincrmatt12.testplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mincrmatt12. Do not copy this or you will have to face
 * our legal team. (dmf444)
 */
public class ViewWithText implements ToolWindowFactory {
    public static ToolWindow theToolWindow;

    public static JTextArea text;

    @Override
    public void createToolWindowContent(Project project, ToolWindow toolWindow) {

        Component theJFrame = toolWindow.getComponent();


        JTextArea textArea = new JTextArea("Test String\n", 10, 30);

        theToolWindow = toolWindow;
        text = textArea;



        text.setEditable(false);

        theJFrame.getParent().add(
            textArea
        );

    }
}
