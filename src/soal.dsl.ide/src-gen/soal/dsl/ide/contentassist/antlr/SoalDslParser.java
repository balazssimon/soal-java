/*
 * generated by Xtext 2.31.0
 */
package soal.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import soal.dsl.ide.contentassist.antlr.internal.InternalSoalDslParser;
import soal.dsl.services.SoalDslGrammarAccess;

public class SoalDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SoalDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SoalDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getOutputParameterListAccess().getAlternatives(), "rule__OutputParameterList__Alternatives");
			builder.put(grammarAccess.getServiceDeclarationAccess().getBindingAlternatives_6_0(), "rule__ServiceDeclaration__BindingAlternatives_6_0");
			builder.put(grammarAccess.getTypeReferenceAccess().getAlternatives(), "rule__TypeReference__Alternatives");
			builder.put(grammarAccess.getArrayTypeAccess().getAlternatives(), "rule__ArrayType__Alternatives");
			builder.put(grammarAccess.getSimpleTypeNameAccess().getAlternatives(), "rule__SimpleTypeName__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getSoalModelAccess().getGroup(), "rule__SoalModel__Group__0");
			builder.put(grammarAccess.getSoalModelAccess().getGroup_3(), "rule__SoalModel__Group_3__0");
			builder.put(grammarAccess.getEnumDeclarationAccess().getGroup(), "rule__EnumDeclaration__Group__0");
			builder.put(grammarAccess.getEnumDeclarationAccess().getGroup_3(), "rule__EnumDeclaration__Group_3__0");
			builder.put(grammarAccess.getEnumDeclarationAccess().getGroup_3_1(), "rule__EnumDeclaration__Group_3_1__0");
			builder.put(grammarAccess.getStructDeclarationAccess().getGroup(), "rule__StructDeclaration__Group__0");
			builder.put(grammarAccess.getStructDeclarationAccess().getGroup_2(), "rule__StructDeclaration__Group_2__0");
			builder.put(grammarAccess.getFieldDeclarationAccess().getGroup(), "rule__FieldDeclaration__Group__0");
			builder.put(grammarAccess.getInterfaceDeclarationAccess().getGroup(), "rule__InterfaceDeclaration__Group__0");
			builder.put(grammarAccess.getResourceDeclarationAccess().getGroup(), "rule__ResourceDeclaration__Group__0");
			builder.put(grammarAccess.getResourceDeclarationAccess().getGroup_3(), "rule__ResourceDeclaration__Group_3__0");
			builder.put(grammarAccess.getResourceDeclarationAccess().getGroup_3_2(), "rule__ResourceDeclaration__Group_3_2__0");
			builder.put(grammarAccess.getOperationDeclarationAccess().getGroup(), "rule__OperationDeclaration__Group__0");
			builder.put(grammarAccess.getOperationDeclarationAccess().getGroup_4(), "rule__OperationDeclaration__Group_4__0");
			builder.put(grammarAccess.getOperationDeclarationAccess().getGroup_4_2(), "rule__OperationDeclaration__Group_4_2__0");
			builder.put(grammarAccess.getInputParameterListAccess().getGroup(), "rule__InputParameterList__Group__0");
			builder.put(grammarAccess.getInputParameterListAccess().getGroup_2(), "rule__InputParameterList__Group_2__0");
			builder.put(grammarAccess.getInputParameterListAccess().getGroup_2_1(), "rule__InputParameterList__Group_2_1__0");
			builder.put(grammarAccess.getOutputParameterListAccess().getGroup_0(), "rule__OutputParameterList__Group_0__0");
			builder.put(grammarAccess.getOutputParameterListAccess().getGroup_1(), "rule__OutputParameterList__Group_1__0");
			builder.put(grammarAccess.getOutputParameterListAccess().getGroup_2(), "rule__OutputParameterList__Group_2__0");
			builder.put(grammarAccess.getOutputParameterListAccess().getGroup_2_2(), "rule__OutputParameterList__Group_2_2__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getServiceDeclarationAccess().getGroup(), "rule__ServiceDeclaration__Group__0");
			builder.put(grammarAccess.getArrayTypeAccess().getGroup_0(), "rule__ArrayType__Group_0__0");
			builder.put(grammarAccess.getArrayTypeAccess().getGroup_1(), "rule__ArrayType__Group_1__0");
			builder.put(grammarAccess.getNullableTypeAccess().getGroup(), "rule__NullableType__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getSoalModelAccess().getNameAssignment_1(), "rule__SoalModel__NameAssignment_1");
			builder.put(grammarAccess.getSoalModelAccess().getImportsAssignment_3_1(), "rule__SoalModel__ImportsAssignment_3_1");
			builder.put(grammarAccess.getSoalModelAccess().getDeclarationsAssignment_4(), "rule__SoalModel__DeclarationsAssignment_4");
			builder.put(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1(), "rule__EnumDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_3_0(), "rule__EnumDeclaration__LiteralsAssignment_3_0");
			builder.put(grammarAccess.getEnumDeclarationAccess().getLiteralsAssignment_3_1_1(), "rule__EnumDeclaration__LiteralsAssignment_3_1_1");
			builder.put(grammarAccess.getEnumLiteralAccess().getNameAssignment(), "rule__EnumLiteral__NameAssignment");
			builder.put(grammarAccess.getStructDeclarationAccess().getNameAssignment_1(), "rule__StructDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getStructDeclarationAccess().getBaseTypeAssignment_2_1(), "rule__StructDeclaration__BaseTypeAssignment_2_1");
			builder.put(grammarAccess.getStructDeclarationAccess().getFieldsAssignment_4(), "rule__StructDeclaration__FieldsAssignment_4");
			builder.put(grammarAccess.getFieldDeclarationAccess().getTypeReferenceAssignment_0(), "rule__FieldDeclaration__TypeReferenceAssignment_0");
			builder.put(grammarAccess.getFieldDeclarationAccess().getNameAssignment_1(), "rule__FieldDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceDeclarationAccess().getNameAssignment_1(), "rule__InterfaceDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getInterfaceDeclarationAccess().getResourcesAssignment_3(), "rule__InterfaceDeclaration__ResourcesAssignment_3");
			builder.put(grammarAccess.getInterfaceDeclarationAccess().getOperationsAssignment_4(), "rule__InterfaceDeclaration__OperationsAssignment_4");
			builder.put(grammarAccess.getResourceDeclarationAccess().getReadonlyAssignment_0(), "rule__ResourceDeclaration__ReadonlyAssignment_0");
			builder.put(grammarAccess.getResourceDeclarationAccess().getEntityAssignment_2(), "rule__ResourceDeclaration__EntityAssignment_2");
			builder.put(grammarAccess.getResourceDeclarationAccess().getExceptionsAssignment_3_1(), "rule__ResourceDeclaration__ExceptionsAssignment_3_1");
			builder.put(grammarAccess.getResourceDeclarationAccess().getExceptionsAssignment_3_2_1(), "rule__ResourceDeclaration__ExceptionsAssignment_3_2_1");
			builder.put(grammarAccess.getOperationDeclarationAccess().getAsyncAssignment_0(), "rule__OperationDeclaration__AsyncAssignment_0");
			builder.put(grammarAccess.getOperationDeclarationAccess().getResponseParametersAssignment_1(), "rule__OperationDeclaration__ResponseParametersAssignment_1");
			builder.put(grammarAccess.getOperationDeclarationAccess().getNameAssignment_2(), "rule__OperationDeclaration__NameAssignment_2");
			builder.put(grammarAccess.getOperationDeclarationAccess().getRequestParametersAssignment_3(), "rule__OperationDeclaration__RequestParametersAssignment_3");
			builder.put(grammarAccess.getOperationDeclarationAccess().getExceptionsAssignment_4_1(), "rule__OperationDeclaration__ExceptionsAssignment_4_1");
			builder.put(grammarAccess.getOperationDeclarationAccess().getExceptionsAssignment_4_2_1(), "rule__OperationDeclaration__ExceptionsAssignment_4_2_1");
			builder.put(grammarAccess.getInputParameterListAccess().getParametersAssignment_2_0(), "rule__InputParameterList__ParametersAssignment_2_0");
			builder.put(grammarAccess.getInputParameterListAccess().getParametersAssignment_2_1_1(), "rule__InputParameterList__ParametersAssignment_2_1_1");
			builder.put(grammarAccess.getOutputParameterListAccess().getParametersAssignment_1_1(), "rule__OutputParameterList__ParametersAssignment_1_1");
			builder.put(grammarAccess.getOutputParameterListAccess().getParametersAssignment_2_1(), "rule__OutputParameterList__ParametersAssignment_2_1");
			builder.put(grammarAccess.getOutputParameterListAccess().getParametersAssignment_2_2_1(), "rule__OutputParameterList__ParametersAssignment_2_2_1");
			builder.put(grammarAccess.getParameterAccess().getTypeReferenceAssignment_0(), "rule__Parameter__TypeReferenceAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getSingleReturnParameterAccess().getTypeReferenceAssignment(), "rule__SingleReturnParameter__TypeReferenceAssignment");
			builder.put(grammarAccess.getServiceDeclarationAccess().getNameAssignment_1(), "rule__ServiceDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getServiceDeclarationAccess().getInterfaceAssignment_3(), "rule__ServiceDeclaration__InterfaceAssignment_3");
			builder.put(grammarAccess.getServiceDeclarationAccess().getBindingAssignment_6(), "rule__ServiceDeclaration__BindingAssignment_6");
			builder.put(grammarAccess.getArrayTypeAccess().getInnerTypeAssignment_0_1(), "rule__ArrayType__InnerTypeAssignment_0_1");
			builder.put(grammarAccess.getArrayTypeAccess().getInnerTypeAssignment_1_1(), "rule__ArrayType__InnerTypeAssignment_1_1");
			builder.put(grammarAccess.getNullableTypeAccess().getInnerTypeAssignment_0(), "rule__NullableType__InnerTypeAssignment_0");
			builder.put(grammarAccess.getSimpleTypeReferenceAccess().getReferencedTypeAssignment(), "rule__SimpleTypeReference__ReferencedTypeAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SoalDslGrammarAccess grammarAccess;

	@Override
	protected InternalSoalDslParser createParser() {
		InternalSoalDslParser result = new InternalSoalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SoalDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SoalDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}