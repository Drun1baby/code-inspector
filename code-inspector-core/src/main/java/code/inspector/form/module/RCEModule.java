package code.inspector.form.module;

import code.inspector.core.Const;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.HashMap;
import java.util.Locale;

public class RCEModule {
    public JPanel parentPanel;
    private JPanel rcePanel;
    private JCheckBox runtimeExecCheckBox;
    private JTextArea runtimeArea;
    private JCheckBox processBuilderCheckBox;
    private JTextArea processArea;
    private JCheckBox groovyShellEvaluateCheckBox;
    private JTextArea groovyArea;
    private JButton saveConfigButton;
    private JCheckBox jndiInjectionCheckBox;
    private JTextArea jndiArea;
    private JCheckBox spELCheckBox;
    private JTextArea spELArea;

    public RCEModule(HashMap<String, Boolean> rceOption) {
        runtimeExecCheckBox.setSelected(rceOption.getOrDefault(
                Const.RCE_RUNTIME_TYPE, false));
        processBuilderCheckBox.setSelected(rceOption.getOrDefault(
                Const.RCE_PROCESS_TYPE, false));
        groovyShellEvaluateCheckBox.setSelected(rceOption.getOrDefault(
                Const.RCE_GROOVY_TYPE, false));
        jndiInjectionCheckBox.setSelected(rceOption.getOrDefault(
                Const.RCE_JNDI_TYPE, false));
        spELCheckBox.setSelected(rceOption.getOrDefault(
                Const.RCE_SP_EL_TYPE, false));
        saveConfigButton.addActionListener(e -> {
            rceOption.put(Const.RCE_RUNTIME_TYPE, runtimeExecCheckBox.isSelected());
            rceOption.put(Const.RCE_PROCESS_TYPE, processBuilderCheckBox.isSelected());
            rceOption.put(Const.RCE_GROOVY_TYPE, groovyShellEvaluateCheckBox.isSelected());
            rceOption.put(Const.RCE_JNDI_TYPE, jndiInjectionCheckBox.isSelected());
            rceOption.put(Const.RCE_SP_EL_TYPE, spELCheckBox.isSelected());
            JOptionPane.showMessageDialog(parentPanel, "success!");
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        parentPanel = new JPanel();
        parentPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        rcePanel = new JPanel();
        rcePanel.setLayout(new GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
        parentPanel.add(rcePanel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        rcePanel.setBorder(BorderFactory.createTitledBorder(null, "RCE Module", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        runtimeExecCheckBox = new JCheckBox();
        runtimeExecCheckBox.setText("runtime exec");
        rcePanel.add(runtimeExecCheckBox, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        runtimeArea = new JTextArea();
        runtimeArea.setEditable(false);
        Font runtimeAreaFont = this.$$$getFont$$$("Consolas", -1, 12, runtimeArea.getFont());
        if (runtimeAreaFont != null) runtimeArea.setFont(runtimeAreaFont);
        runtimeArea.setForeground(new Color(-9097));
        runtimeArea.setText("String cmd = \"cmd \" + input;\nRuntime.getRuntime().exec(cmd);");
        rcePanel.add(runtimeArea, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        processBuilderCheckBox = new JCheckBox();
        processBuilderCheckBox.setText("process builder start");
        rcePanel.add(processBuilderCheckBox, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        processArea = new JTextArea();
        processArea.setEditable(false);
        Font processAreaFont = this.$$$getFont$$$("Consolas", -1, 12, processArea.getFont());
        if (processAreaFont != null) processArea.setFont(processAreaFont);
        processArea.setForeground(new Color(-9097));
        processArea.setText("String cmd = \"cmd \" + input;\nnew ProcessBuilder(cmd).start();");
        rcePanel.add(processArea, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        groovyShellEvaluateCheckBox = new JCheckBox();
        groovyShellEvaluateCheckBox.setText("groovy shell evaluate");
        rcePanel.add(groovyShellEvaluateCheckBox, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        groovyArea = new JTextArea();
        groovyArea.setEditable(false);
        Font groovyAreaFont = this.$$$getFont$$$("Consolas", -1, 12, groovyArea.getFont());
        if (groovyAreaFont != null) groovyArea.setFont(groovyAreaFont);
        groovyArea.setForeground(new Color(-9097));
        groovyArea.setText("GroovyShell shell = new GroovyShell();\nshell.evaluate(input);");
        rcePanel.add(groovyArea, new GridConstraints(3, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        saveConfigButton = new JButton();
        saveConfigButton.setText("Save Config");
        rcePanel.add(saveConfigButton, new GridConstraints(5, 0, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        jndiInjectionCheckBox = new JCheckBox();
        jndiInjectionCheckBox.setText("jndi injection");
        rcePanel.add(jndiInjectionCheckBox, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        jndiArea = new JTextArea();
        jndiArea.setEditable(false);
        Font jndiAreaFont = this.$$$getFont$$$("Consolas", -1, 12, jndiArea.getFont());
        if (jndiAreaFont != null) jndiArea.setFont(jndiAreaFont);
        jndiArea.setForeground(new Color(-9097));
        jndiArea.setText("Context context = new InitialContext();\ncontext.lookup(input);");
        rcePanel.add(jndiArea, new GridConstraints(2, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        spELCheckBox = new JCheckBox();
        spELCheckBox.setText("spring el rce");
        rcePanel.add(spELCheckBox, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 1, false));
        spELArea = new JTextArea();
        spELArea.setEditable(false);
        Font spELAreaFont = this.$$$getFont$$$("Consolas", -1, 12, spELArea.getFont());
        if (spELAreaFont != null) spELArea.setFont(spELAreaFont);
        spELArea.setForeground(new Color(-9097));
        spELArea.setText("ExpressionParser parser = new SpelExpressionParser();\nEvaluationContext evaluationContext = new StandardEvaluationContext();\nparser.parseExpression(input).getValue(evaluationContext);");
        rcePanel.add(spELArea, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return parentPanel;
    }

}