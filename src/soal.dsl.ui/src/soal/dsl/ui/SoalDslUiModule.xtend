/*
 * generated by Xtext 2.31.0
 */
package soal.dsl.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.builder.IXtextBuilderParticipant
import org.eclipse.xtext.ui.editor.hover.IEObjectHover
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider
import soal.dsl.ui.generator.BuilderParticipantForResourceSet
import soal.dsl.ui.hover.SoalHoverProvider
import soal.dsl.ui.hover.SoalTextHover

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SoalDslUiModule extends AbstractSoalDslUiModule {
 
    override Class<? extends IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
        BuilderParticipantForResourceSet
    }

    override Class<? extends IEObjectHover> bindIEObjectHover() {
        SoalTextHover
    }

    def Class<? extends IEObjectHoverProvider> bindIEObjectHoverProvider() {
        SoalHoverProvider
    }
	
}
