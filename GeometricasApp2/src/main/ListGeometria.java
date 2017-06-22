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
	
	public Geometria[] sortByLados(Geometria[] arrayGeo){
		
		return null;
	}
	
	public int getSize(){
		return listGeo.length;
	}
	
	
	
}
