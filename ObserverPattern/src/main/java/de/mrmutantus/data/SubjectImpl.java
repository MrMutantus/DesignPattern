package de.mrmutantus.data;

public interface SubjectImpl {
  void registerObserver(ObserverImpl o);

  void removeObserver(ObserverImpl o);

  void notifyObservers();
}
