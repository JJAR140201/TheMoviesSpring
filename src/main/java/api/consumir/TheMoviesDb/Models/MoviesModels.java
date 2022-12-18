package api.consumir.TheMoviesDb.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MoviesModels implements Serializable {
    private static final long serialVersionUID = 1l;

    // A getter and setter method.
    @JsonProperty("postId")
    private Integer postId;
    private Integer Id;
    private String original_title;
    private String original_language;
    private String overview;

    // This is a getter and setter method.
    public Integer getPostId(){
        return postId;
    }
    public void setPostId(Integer postId){
        this.postId = postId;
    }

    // This is a getter and setter method.
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    // This is a getter and setter method.
    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    // This is a getter and setter method.
    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    // This is a getter and setter method.
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    // A constructor.
    public MoviesModels(){
        super();
    }

    /**
     * The toString() method returns the string representation of the object
     *
     * @return The toString() method returns a string representation of the object.
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("MoviesModels [postId =");
        builder.append(postId);
        builder.append(", Id=");
        builder.append(Id);
        builder.append(", Titulo=");
        builder.append(original_title);
        builder.append(", Lenguaje=");
        builder.append(original_language);
        builder.append(", Overview=");
        builder.append(overview);
        builder.append("]");
        return builder.toString();
    }
}
