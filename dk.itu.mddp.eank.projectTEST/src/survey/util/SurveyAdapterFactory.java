/**
 */
package survey.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import survey.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see survey.SurveyPackage
 * @generated
 */
public class SurveyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SurveyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SurveyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurveySwitch<Adapter> modelSwitch =
		new SurveySwitch<Adapter>() {
			@Override
			public Adapter caseSurvey(Survey object) {
				return createSurveyAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseMultipleChoice(MultipleChoice object) {
				return createMultipleChoiceAdapter();
			}
			@Override
			public Adapter caseOpen(Open object) {
				return createOpenAdapter();
			}
			@Override
			public Adapter caseRating(Rating object) {
				return createRatingAdapter();
			}
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseRanking(Ranking object) {
				return createRankingAdapter();
			}
			@Override
			public Adapter caseConstantSum(ConstantSum object) {
				return createConstantSumAdapter();
			}
			@Override
			public Adapter caseStaple(Staple object) {
				return createStapleAdapter();
			}
			@Override
			public Adapter caseFork(Fork object) {
				return createForkAdapter();
			}
			@Override
			public Adapter caseRatingFork(RatingFork object) {
				return createRatingForkAdapter();
			}
			@Override
			public Adapter caseChoiceFork(ChoiceFork object) {
				return createChoiceForkAdapter();
			}
			@Override
			public Adapter caseRankingChoiceFork(RankingChoiceFork object) {
				return createRankingChoiceForkAdapter();
			}
			@Override
			public Adapter caseRankingSumFork(RankingSumFork object) {
				return createRankingSumForkAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link survey.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Survey
	 * @generated
	 */
	public Adapter createSurveyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.MultipleChoice
	 * @generated
	 */
	public Adapter createMultipleChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Open
	 * @generated
	 */
	public Adapter createOpenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Rating
	 * @generated
	 */
	public Adapter createRatingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Ranking
	 * @generated
	 */
	public Adapter createRankingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.ConstantSum <em>Constant Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.ConstantSum
	 * @generated
	 */
	public Adapter createConstantSumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Staple <em>Staple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Staple
	 * @generated
	 */
	public Adapter createStapleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Fork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Fork
	 * @generated
	 */
	public Adapter createForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.RatingFork <em>Rating Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.RatingFork
	 * @generated
	 */
	public Adapter createRatingForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.ChoiceFork <em>Choice Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.ChoiceFork
	 * @generated
	 */
	public Adapter createChoiceForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.RankingChoiceFork <em>Ranking Choice Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.RankingChoiceFork
	 * @generated
	 */
	public Adapter createRankingChoiceForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.RankingSumFork <em>Ranking Sum Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.RankingSumFork
	 * @generated
	 */
	public Adapter createRankingSumForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link survey.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see survey.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SurveyAdapterFactory
