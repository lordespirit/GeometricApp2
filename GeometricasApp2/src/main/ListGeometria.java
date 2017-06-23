package main;

public class ListGeometria {

	private Geometria[] listGeo;
	
	public ListGeometria(){
		listGeo= new Geometria[0];
	}
	
	public void add(Geometria newGeo){
		Geometria[] copyListGeo = new Geometria[listGeo.length+1];
		for(int i=0;i<listGeo.length;i++){
			copyListGeo[i]=listGeo[i];
		}
		copyListGeo[copyListGeo.length-1]=newGeo;
		listGeo = copyListGeo;
	}
	
	public void remove(int index){
		Geometria[] copyListGeo = new Geometria[listGeo.length-1];
		for(int i=0, j=0;i<listGeo.length;i++){
			if(i!=index)
			copyListGeo[j++]=listGeo[i];
		}
		listGeo = copyListGeo;
	}
	
	public void remove(Geometria geo){
		Geometria[] copyListGeo = new Geometria[listGeo.length-1];
		for(int i=0, j=0;i<listGeo.length;i++){
			if(listGeo.equals(geo))
			copyListGeo[j++]=listGeo[i];
		}
		listGeo = copyListGeo;
	}
	
	/**
	 * Método de ordenación
	 * Si se añaden dos figuras con los mismos lados entonces la primera en haber sido añadida será la primera.
	 */
	public void sortByLados(){
		Geometria[] copyListGeo = new Geometria[listGeo.length];
		
		// COPIA
			copyListGeo = listGeo;

		// ORDENACION
		for(int i=1;i<copyListGeo.length;i++){
			if(copyListGeo[i].getLados()<copyListGeo[i-1].getLados()){
				Geometria control = copyListGeo[i];
				copyListGeo[i] = copyListGeo[i-1];
				copyListGeo[i-1] = control;
				i=0;
			}
		}
		
		listGeo = copyListGeo;
	}
	
	public int size(){
		return listGeo.length;
	}
	
	public Geometria get(int index){
		return listGeo[index];
	}
	
	
}
