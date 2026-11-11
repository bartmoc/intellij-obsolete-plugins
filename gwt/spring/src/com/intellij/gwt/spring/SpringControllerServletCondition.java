package com.intellij.gwt.spring;

import com.intellij.openapi.util.Condition;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiModifierList;
import org.jetbrains.annotations.NotNull;

final class SpringControllerServletCondition implements Condition<PsiClass> {

  @Override
  public boolean value(@NotNull PsiClass psiClass) {
    final PsiModifierList modifierList = psiClass.getModifierList();
    return modifierList != null && modifierList.hasAnnotation("org.springframework.web.bind.annotation.RequestMapping");
  }
}
