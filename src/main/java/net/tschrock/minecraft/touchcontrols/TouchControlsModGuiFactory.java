/*    */ package net.tschrock.minecraft.touchcontrols;
/*    */ 
/*    */ import java.util.Set;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.GuiScreen;
/*    */ import net.minecraftforge.fml.client.IModGuiFactory;
/*    */ import net.minecraftforge.fml.client.IModGuiFactory.RuntimeOptionCategoryElement;
/*    */ 
/*    */ public class TouchControlsModGuiFactory implements IModGuiFactory
/*    */ {
/*    */   public void initialize(Minecraft minecraftInstance) {}
/*    */   
/*    */   public Class<? extends GuiScreen> mainConfigGuiClass()
/*    */   {
/* 16 */     return TouchControlsModConfigGUI.class;
/*    */   }
/*    */   
/*    */   public Set<IModGuiFactory.RuntimeOptionCategoryElement> runtimeGuiCategories()
/*    */   {
/* 21 */     return null;
/*    */   }
/*    */   
/*    */   
/*    */
@Override
public boolean hasConfigGui() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public GuiScreen createConfigGui(GuiScreen parentScreen) {
	// TODO Auto-generated method stub
	return null;
} }


/* Location:              /home/alan/Downloads/touchcontrols-1.8-0.0.3(1).jar!/net/tschrock/minecraft/touchcontrols/TouchControlsModGuiFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */