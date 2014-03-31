/**
 */
package survey;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see survey.SurveyFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "survey";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/dk.itu.mddp.eank.project/model/SurveyModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surveyModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyPackage eINSTANCE = survey.impl.SurveyPackageImpl.init();

	/**
	 * The meta object id for the '{@link survey.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ModelImpl
	 * @see survey.impl.SurveyPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Surveys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SURVEYS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SurveyImpl
	 * @see survey.impl.SurveyPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__QUESTIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.QuestionImpl
	 * @see survey.impl.SurveyPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRED = 2;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_REQUIRED = 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.MultipleChoiceImpl
	 * @see survey.impl.SurveyPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__IS_REQUIRED = QUESTION__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__CHOICE = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__OTHER = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__FORK = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Answer Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__ANSWER_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.OpenImpl
	 * @see survey.impl.SurveyPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__IS_REQUIRED = QUESTION__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Answer Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__ANSWER_LENGTH = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RatingImpl
	 * @see survey.impl.SurveyPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__IS_REQUIRED = QUESTION__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MIN = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MAX = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__FIRST = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__LAST = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__FORK = QUESTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ChoiceImpl
	 * @see survey.impl.SurveyPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RankingImpl
	 * @see survey.impl.SurveyPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__IS_REQUIRED = QUESTION__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CHOICES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__FORK = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.DichotomousImpl <em>Dichotomous</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.DichotomousImpl
	 * @see survey.impl.SurveyPackageImpl#getDichotomous()
	 * @generated
	 */
	int DICHOTOMOUS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__IS_REQUIRED = QUESTION__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>On Yes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__ON_YES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On No</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS__ON_NO = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dichotomous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dichotomous</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.SumConstantImpl <em>Sum Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.SumConstantImpl
	 * @see survey.impl.SurveyPackageImpl#getSumConstant()
	 * @generated
	 */
	int SUM_CONSTANT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__NAME = QUESTION__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__QUESTION = QUESTION__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__REQUIRED = QUESTION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__IS_REQUIRED = QUESTION__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__CHOICES = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__CONSTANT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT__FORK = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sum Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_CONSTANT_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.StapleImpl <em>Staple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.StapleImpl
	 * @see survey.impl.SurveyPackageImpl#getStaple()
	 * @generated
	 */
	int STAPLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__NAME = RATING__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__QUESTION = RATING__QUESTION;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__REQUIRED = RATING__REQUIRED;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__IS_REQUIRED = RATING__IS_REQUIRED;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MIN = RATING__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MAX = RATING__MAX;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__FIRST = RATING__FIRST;

	/**
	 * The feature id for the '<em><b>Last</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__LAST = RATING__LAST;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__FORK = RATING__FORK;

	/**
	 * The feature id for the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE__MID = RATING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Staple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE_FEATURE_COUNT = RATING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Staple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAPLE_OPERATION_COUNT = RATING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.Fork <em>Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.Fork
	 * @see survey.impl.SurveyPackageImpl#getFork()
	 * @generated
	 */
	int FORK = 11;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK__QUESTIONS = 0;

	/**
	 * The number of structural features of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link survey.impl.RatingForkImpl <em>Rating Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RatingForkImpl
	 * @see survey.impl.SurveyPackageImpl#getRatingFork()
	 * @generated
	 */
	int RATING_FORK = 12;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__QUESTIONS = FORK__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__MIN = FORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK__MAX = FORK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rating Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK_FEATURE_COUNT = FORK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rating Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FORK_OPERATION_COUNT = FORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.ChoiceForkImpl <em>Choice Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.ChoiceForkImpl
	 * @see survey.impl.SurveyPackageImpl#getChoiceFork()
	 * @generated
	 */
	int CHOICE_FORK = 13;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FORK__QUESTIONS = FORK__QUESTIONS;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FORK__ON = FORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FORK_FEATURE_COUNT = FORK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FORK_OPERATION_COUNT = FORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.DichotomousForkImpl <em>Dichotomous Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.DichotomousForkImpl
	 * @see survey.impl.SurveyPackageImpl#getDichotomousFork()
	 * @generated
	 */
	int DICHOTOMOUS_FORK = 14;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_FORK__QUESTIONS = FORK__QUESTIONS;

	/**
	 * The number of structural features of the '<em>Dichotomous Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_FORK_FEATURE_COUNT = FORK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dichotomous Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICHOTOMOUS_FORK_OPERATION_COUNT = FORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RankingChoiceForkImpl <em>Ranking Choice Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RankingChoiceForkImpl
	 * @see survey.impl.SurveyPackageImpl#getRankingChoiceFork()
	 * @generated
	 */
	int RANKING_CHOICE_FORK = 15;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_CHOICE_FORK__QUESTIONS = FORK__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_CHOICE_FORK__MAX = FORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_CHOICE_FORK__ON = FORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_CHOICE_FORK__MIN = FORK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ranking Choice Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_CHOICE_FORK_FEATURE_COUNT = FORK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ranking Choice Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_CHOICE_FORK_OPERATION_COUNT = FORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link survey.impl.RankingSumForkImpl <em>Ranking Sum Fork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see survey.impl.RankingSumForkImpl
	 * @see survey.impl.SurveyPackageImpl#getRankingSumFork()
	 * @generated
	 */
	int RANKING_SUM_FORK = 16;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_SUM_FORK__QUESTIONS = FORK__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_SUM_FORK__MAX = FORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_SUM_FORK__MIN = FORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_SUM_FORK__ON = FORK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ranking Sum Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_SUM_FORK_FEATURE_COUNT = FORK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ranking Sum Fork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_SUM_FORK_OPERATION_COUNT = FORK_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link survey.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see survey.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Model#getSurveys <em>Surveys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Surveys</em>'.
	 * @see survey.Model#getSurveys()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Surveys();

	/**
	 * Returns the meta object for class '{@link survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see survey.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Survey#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see survey.Survey#getQuestions()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Questions();

	/**
	 * Returns the meta object for the attribute '{@link survey.Survey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.Survey#getName()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Name();

	/**
	 * Returns the meta object for class '{@link survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see survey.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see survey.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see survey.Question#isRequired()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Required();

	/**
	 * Returns the meta object for the attribute '{@link survey.Question#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see survey.Question#isIsRequired()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsRequired();

	/**
	 * Returns the meta object for class '{@link survey.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see survey.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see survey.MultipleChoice#getChoice()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Choice();

	/**
	 * Returns the meta object for the attribute '{@link survey.MultipleChoice#getOther <em>Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other</em>'.
	 * @see survey.MultipleChoice#getOther()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Other();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.MultipleChoice#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see survey.MultipleChoice#getFork()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EReference getMultipleChoice_Fork();

	/**
	 * Returns the meta object for the attribute '{@link survey.MultipleChoice#getAnswerCount <em>Answer Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Count</em>'.
	 * @see survey.MultipleChoice#getAnswerCount()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_AnswerCount();

	/**
	 * Returns the meta object for class '{@link survey.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see survey.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for the attribute '{@link survey.Open#getAnswerLength <em>Answer Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer Length</em>'.
	 * @see survey.Open#getAnswerLength()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_AnswerLength();

	/**
	 * Returns the meta object for class '{@link survey.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see survey.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.Rating#getMin()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.Rating#getMax()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First</em>'.
	 * @see survey.Rating#getFirst()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_First();

	/**
	 * Returns the meta object for the attribute '{@link survey.Rating#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last</em>'.
	 * @see survey.Rating#getLast()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Last();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Rating#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see survey.Rating#getFork()
	 * @see #getRating()
	 * @generated
	 */
	EReference getRating_Fork();

	/**
	 * Returns the meta object for class '{@link survey.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see survey.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link survey.Choice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see survey.Choice#getDescription()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Description();

	/**
	 * Returns the meta object for the attribute '{@link survey.Choice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see survey.Choice#getName()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Name();

	/**
	 * Returns the meta object for class '{@link survey.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see survey.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Ranking#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see survey.Ranking#getChoices()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Choices();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.Ranking#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see survey.Ranking#getFork()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Fork();

	/**
	 * Returns the meta object for class '{@link survey.Dichotomous <em>Dichotomous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dichotomous</em>'.
	 * @see survey.Dichotomous
	 * @generated
	 */
	EClass getDichotomous();

	/**
	 * Returns the meta object for the containment reference '{@link survey.Dichotomous#getOnYes <em>On Yes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Yes</em>'.
	 * @see survey.Dichotomous#getOnYes()
	 * @see #getDichotomous()
	 * @generated
	 */
	EReference getDichotomous_OnYes();

	/**
	 * Returns the meta object for the containment reference '{@link survey.Dichotomous#getOnNo <em>On No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On No</em>'.
	 * @see survey.Dichotomous#getOnNo()
	 * @see #getDichotomous()
	 * @generated
	 */
	EReference getDichotomous_OnNo();

	/**
	 * Returns the meta object for class '{@link survey.SumConstant <em>Sum Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum Constant</em>'.
	 * @see survey.SumConstant
	 * @generated
	 */
	EClass getSumConstant();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.SumConstant#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choices</em>'.
	 * @see survey.SumConstant#getChoices()
	 * @see #getSumConstant()
	 * @generated
	 */
	EReference getSumConstant_Choices();

	/**
	 * Returns the meta object for the attribute '{@link survey.SumConstant#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see survey.SumConstant#getConstant()
	 * @see #getSumConstant()
	 * @generated
	 */
	EAttribute getSumConstant_Constant();

	/**
	 * Returns the meta object for the containment reference list '{@link survey.SumConstant#getFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork</em>'.
	 * @see survey.SumConstant#getFork()
	 * @see #getSumConstant()
	 * @generated
	 */
	EReference getSumConstant_Fork();

	/**
	 * Returns the meta object for class '{@link survey.Staple <em>Staple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staple</em>'.
	 * @see survey.Staple
	 * @generated
	 */
	EClass getStaple();

	/**
	 * Returns the meta object for the attribute '{@link survey.Staple#getMid <em>Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid</em>'.
	 * @see survey.Staple#getMid()
	 * @see #getStaple()
	 * @generated
	 */
	EAttribute getStaple_Mid();

	/**
	 * Returns the meta object for class '{@link survey.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork</em>'.
	 * @see survey.Fork
	 * @generated
	 */
	EClass getFork();

	/**
	 * Returns the meta object for the reference list '{@link survey.Fork#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Questions</em>'.
	 * @see survey.Fork#getQuestions()
	 * @see #getFork()
	 * @generated
	 */
	EReference getFork_Questions();

	/**
	 * Returns the meta object for class '{@link survey.RatingFork <em>Rating Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating Fork</em>'.
	 * @see survey.RatingFork
	 * @generated
	 */
	EClass getRatingFork();

	/**
	 * Returns the meta object for the attribute '{@link survey.RatingFork#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.RatingFork#getMin()
	 * @see #getRatingFork()
	 * @generated
	 */
	EAttribute getRatingFork_Min();

	/**
	 * Returns the meta object for the attribute '{@link survey.RatingFork#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.RatingFork#getMax()
	 * @see #getRatingFork()
	 * @generated
	 */
	EAttribute getRatingFork_Max();

	/**
	 * Returns the meta object for class '{@link survey.ChoiceFork <em>Choice Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Fork</em>'.
	 * @see survey.ChoiceFork
	 * @generated
	 */
	EClass getChoiceFork();

	/**
	 * Returns the meta object for the reference list '{@link survey.ChoiceFork#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On</em>'.
	 * @see survey.ChoiceFork#getOn()
	 * @see #getChoiceFork()
	 * @generated
	 */
	EReference getChoiceFork_On();

	/**
	 * Returns the meta object for class '{@link survey.DichotomousFork <em>Dichotomous Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dichotomous Fork</em>'.
	 * @see survey.DichotomousFork
	 * @generated
	 */
	EClass getDichotomousFork();

	/**
	 * Returns the meta object for class '{@link survey.RankingChoiceFork <em>Ranking Choice Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Choice Fork</em>'.
	 * @see survey.RankingChoiceFork
	 * @generated
	 */
	EClass getRankingChoiceFork();

	/**
	 * Returns the meta object for the attribute '{@link survey.RankingChoiceFork#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.RankingChoiceFork#getMax()
	 * @see #getRankingChoiceFork()
	 * @generated
	 */
	EAttribute getRankingChoiceFork_Max();

	/**
	 * Returns the meta object for the reference list '{@link survey.RankingChoiceFork#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On</em>'.
	 * @see survey.RankingChoiceFork#getOn()
	 * @see #getRankingChoiceFork()
	 * @generated
	 */
	EReference getRankingChoiceFork_On();

	/**
	 * Returns the meta object for the attribute '{@link survey.RankingChoiceFork#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.RankingChoiceFork#getMin()
	 * @see #getRankingChoiceFork()
	 * @generated
	 */
	EAttribute getRankingChoiceFork_Min();

	/**
	 * Returns the meta object for class '{@link survey.RankingSumFork <em>Ranking Sum Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Sum Fork</em>'.
	 * @see survey.RankingSumFork
	 * @generated
	 */
	EClass getRankingSumFork();

	/**
	 * Returns the meta object for the attribute '{@link survey.RankingSumFork#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see survey.RankingSumFork#getMax()
	 * @see #getRankingSumFork()
	 * @generated
	 */
	EAttribute getRankingSumFork_Max();

	/**
	 * Returns the meta object for the attribute '{@link survey.RankingSumFork#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see survey.RankingSumFork#getMin()
	 * @see #getRankingSumFork()
	 * @generated
	 */
	EAttribute getRankingSumFork_Min();

	/**
	 * Returns the meta object for the reference list '{@link survey.RankingSumFork#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>On</em>'.
	 * @see survey.RankingSumFork#getOn()
	 * @see #getRankingSumFork()
	 * @generated
	 */
	EReference getRankingSumFork_On();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveyFactory getSurveyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link survey.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ModelImpl
		 * @see survey.impl.SurveyPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Surveys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SURVEYS = eINSTANCE.getModel_Surveys();

		/**
		 * The meta object literal for the '{@link survey.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SurveyImpl
		 * @see survey.impl.SurveyPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__QUESTIONS = eINSTANCE.getSurvey_Questions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__NAME = eINSTANCE.getSurvey_Name();

		/**
		 * The meta object literal for the '{@link survey.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.QuestionImpl
		 * @see survey.impl.SurveyPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REQUIRED = eINSTANCE.getQuestion_Required();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_REQUIRED = eINSTANCE.getQuestion_IsRequired();

		/**
		 * The meta object literal for the '{@link survey.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.MultipleChoiceImpl
		 * @see survey.impl.SurveyPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__CHOICE = eINSTANCE.getMultipleChoice_Choice();

		/**
		 * The meta object literal for the '<em><b>Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__OTHER = eINSTANCE.getMultipleChoice_Other();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHOICE__FORK = eINSTANCE.getMultipleChoice_Fork();

		/**
		 * The meta object literal for the '<em><b>Answer Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__ANSWER_COUNT = eINSTANCE.getMultipleChoice_AnswerCount();

		/**
		 * The meta object literal for the '{@link survey.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.OpenImpl
		 * @see survey.impl.SurveyPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '<em><b>Answer Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__ANSWER_LENGTH = eINSTANCE.getOpen_AnswerLength();

		/**
		 * The meta object literal for the '{@link survey.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RatingImpl
		 * @see survey.impl.SurveyPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__MIN = eINSTANCE.getRating_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__MAX = eINSTANCE.getRating_Max();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__FIRST = eINSTANCE.getRating_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__LAST = eINSTANCE.getRating_Last();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATING__FORK = eINSTANCE.getRating_Fork();

		/**
		 * The meta object literal for the '{@link survey.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ChoiceImpl
		 * @see survey.impl.SurveyPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DESCRIPTION = eINSTANCE.getChoice_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__NAME = eINSTANCE.getChoice_Name();

		/**
		 * The meta object literal for the '{@link survey.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RankingImpl
		 * @see survey.impl.SurveyPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__CHOICES = eINSTANCE.getRanking_Choices();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__FORK = eINSTANCE.getRanking_Fork();

		/**
		 * The meta object literal for the '{@link survey.impl.DichotomousImpl <em>Dichotomous</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.DichotomousImpl
		 * @see survey.impl.SurveyPackageImpl#getDichotomous()
		 * @generated
		 */
		EClass DICHOTOMOUS = eINSTANCE.getDichotomous();

		/**
		 * The meta object literal for the '<em><b>On Yes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICHOTOMOUS__ON_YES = eINSTANCE.getDichotomous_OnYes();

		/**
		 * The meta object literal for the '<em><b>On No</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICHOTOMOUS__ON_NO = eINSTANCE.getDichotomous_OnNo();

		/**
		 * The meta object literal for the '{@link survey.impl.SumConstantImpl <em>Sum Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.SumConstantImpl
		 * @see survey.impl.SurveyPackageImpl#getSumConstant()
		 * @generated
		 */
		EClass SUM_CONSTANT = eINSTANCE.getSumConstant();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUM_CONSTANT__CHOICES = eINSTANCE.getSumConstant_Choices();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUM_CONSTANT__CONSTANT = eINSTANCE.getSumConstant_Constant();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUM_CONSTANT__FORK = eINSTANCE.getSumConstant_Fork();

		/**
		 * The meta object literal for the '{@link survey.impl.StapleImpl <em>Staple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.StapleImpl
		 * @see survey.impl.SurveyPackageImpl#getStaple()
		 * @generated
		 */
		EClass STAPLE = eINSTANCE.getStaple();

		/**
		 * The meta object literal for the '<em><b>Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAPLE__MID = eINSTANCE.getStaple_Mid();

		/**
		 * The meta object literal for the '{@link survey.Fork <em>Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.Fork
		 * @see survey.impl.SurveyPackageImpl#getFork()
		 * @generated
		 */
		EClass FORK = eINSTANCE.getFork();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORK__QUESTIONS = eINSTANCE.getFork_Questions();

		/**
		 * The meta object literal for the '{@link survey.impl.RatingForkImpl <em>Rating Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RatingForkImpl
		 * @see survey.impl.SurveyPackageImpl#getRatingFork()
		 * @generated
		 */
		EClass RATING_FORK = eINSTANCE.getRatingFork();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_FORK__MIN = eINSTANCE.getRatingFork_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING_FORK__MAX = eINSTANCE.getRatingFork_Max();

		/**
		 * The meta object literal for the '{@link survey.impl.ChoiceForkImpl <em>Choice Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.ChoiceForkImpl
		 * @see survey.impl.SurveyPackageImpl#getChoiceFork()
		 * @generated
		 */
		EClass CHOICE_FORK = eINSTANCE.getChoiceFork();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE_FORK__ON = eINSTANCE.getChoiceFork_On();

		/**
		 * The meta object literal for the '{@link survey.impl.DichotomousForkImpl <em>Dichotomous Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.DichotomousForkImpl
		 * @see survey.impl.SurveyPackageImpl#getDichotomousFork()
		 * @generated
		 */
		EClass DICHOTOMOUS_FORK = eINSTANCE.getDichotomousFork();

		/**
		 * The meta object literal for the '{@link survey.impl.RankingChoiceForkImpl <em>Ranking Choice Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RankingChoiceForkImpl
		 * @see survey.impl.SurveyPackageImpl#getRankingChoiceFork()
		 * @generated
		 */
		EClass RANKING_CHOICE_FORK = eINSTANCE.getRankingChoiceFork();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_CHOICE_FORK__MAX = eINSTANCE.getRankingChoiceFork_Max();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_CHOICE_FORK__ON = eINSTANCE.getRankingChoiceFork_On();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_CHOICE_FORK__MIN = eINSTANCE.getRankingChoiceFork_Min();

		/**
		 * The meta object literal for the '{@link survey.impl.RankingSumForkImpl <em>Ranking Sum Fork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see survey.impl.RankingSumForkImpl
		 * @see survey.impl.SurveyPackageImpl#getRankingSumFork()
		 * @generated
		 */
		EClass RANKING_SUM_FORK = eINSTANCE.getRankingSumFork();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_SUM_FORK__MAX = eINSTANCE.getRankingSumFork_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_SUM_FORK__MIN = eINSTANCE.getRankingSumFork_Min();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_SUM_FORK__ON = eINSTANCE.getRankingSumFork_On();

	}

} //SurveyPackage