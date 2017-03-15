package com.mycompany.app;

import graphql.GraphQL;
import graphql.schema.GraphQLInterfaceType;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import java.util.Map;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import static graphql.schema.GraphQLInterfaceType.newInterface;
import static graphql.schema.GraphQLObjectType.newObject;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        GraphQLObjectType queryType = newObject()
                .name("helloWorldQuery")
                .field(newFieldDefinition()
                        .type(GraphQLString)
                        .name("hello")
                        .staticValue("world"))
                .build();

        GraphQLSchema schema = GraphQLSchema.newSchema()
                .query(queryType)
                .build();

        GraphQL graphQL = new GraphQL(schema);
        //  Comment ce con récupère ma data ? Je lui ai meme pas donné de database
        Map<String, Object> result = (Map<String, Object>) graphQL.execute("{hello}").getData();
        System.out.println(result);


    }

}
