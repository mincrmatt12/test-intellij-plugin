package io.github.mincrmatt12.testplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Created by mincrmatt12. Do not copy this or you will have to face
 * our legal team. (dmf444)
 */
public class TestAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here

        if (ViewWithText.theToolWindow != null) {

            ViewWithText.text.append("hello\n");
            ViewWithText.text.append("hello\n");

            ViewWithText.theToolWindow.activate(new Runnable() {
                @Override
                public void run() {

                }
            });
        }
    }
}
