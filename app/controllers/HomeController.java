package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import graphql.GraphQL;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import models.Consultant;
import play.mvc.Controller;
import play.mvc.Result;


import java.io.IOException;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLObjectType.newObject;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() throws IOException {
        GraphQLObjectType queryType = newObject()
                .name("helloWorldQuery")
                .field(newFieldDefinition()
                        .type(GraphQLString)
                        .name("hello")
                        .staticValue("world")
                        .build())
                .build();

        GraphQLSchema schema = GraphQLSchema.newSchema()
                .query(queryType)
                .build();

        GraphQL graphQL = new GraphQL(schema);

        Object result = graphQL.execute("{hello}").getData();

        ObjectMapper mapper = new ObjectMapper();


        System.out.println(result);
        String json = mapper.writeValueAsString(result);
        return ok(mapper.readTree(json));
    }

    public Result showConsultant() throws Exception {
      ObjectMapper mapper = new ObjectMapper();
      String json = mapper.writeValueAsString(new Consultant());
        return ok(mapper.readTree(json));
    }

    public Result addConsultant() throws Exception {
        Consultant created = new Consultant();
        created.save();
        System.out.println(created.id);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(created);
        return ok(mapper.readTree(json));
    }
}
