package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "icon")
    private String icon;

    @Column(name = "parent_id")
    private Long parentId;

    @ManyToMany(mappedBy = "menus", fetch = FetchType.LAZY)
    private Set<Role> roles;
}
