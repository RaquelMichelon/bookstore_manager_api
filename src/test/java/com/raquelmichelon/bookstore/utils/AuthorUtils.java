//package com.raquelmichelon.bookstore.utils;
//
//import com.github.javafaker.Faker;
//import com.raquelmichelon.bookstore.dto.AuthorDTO;
//import com.raquelmichelon.bookstore.entities.Author;
//
//public class AuthorUtils {
//
//    private static final Faker faker = Faker.instance();
//
//    public static AuthorDTO createFakeAuthorDTO() {
//        return AuthorDTO.builder()
//                .id(faker.number().randomNumber())
//                .name(faker.book().author())
//                .age(faker.number().numberBetween(0, 100))
//                .build();
//    }
//
//    public static Author createFakeAuthor() {
//        return Author.builder()
//                .id(faker.number().randomNumber())
//                .name(faker.book().author())
//                .age(faker.number().numberBetween(0, 100))
//                .build();
//    }
//
//    public static Author createFakeAuthorFrom(AuthorDTO authorDTO) {
//        return Author.builder()
//                .id(authorDTO.getId())
//                .name(authorDTO.getName())
//                .age(authorDTO.getAge())
//                .build();
//    }
//}
